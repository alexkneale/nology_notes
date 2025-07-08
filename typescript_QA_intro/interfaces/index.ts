//// interfaces
// behave like contracts
// when we sign (implement) it we must follow its rules

// interfaces are like abstract classes with (only) abstract methods and properties
// there is no actual data or code within

interface CarInterface {
    speed: number;
    power: number;
}

// interfaces are duck typed (or structual subtyped)
// compiler simply chekcs we have at least the required members

function parkCar(car: CarInterface) {
    car.speed = 0;
    console.log("Car is parked");
}

parkCar({ speed: 50, power: 200 });

// more logic with properties which may not be requried

interface CarTimeMachineInterface {
    speed: number;
    fluxCapacitor?: boolean;
    powerOutput?: number;
}

function timeTravel(car: CarTimeMachineInterface) {
    if (car.fluxCapacitor && car.powerOutput >= 1.21) {
        car.speed = 88;
        console.log("Travelling to 1955");
    }
}

timeTravel({ speed: 50, fluxCapacitor: true, powerOutput: 1.21 });

//// function types
// can use interfaces to describe functions

// note that name of param in implementation need
// not match the name in the interface
interface Log {
    (error: string): void;
}

let logError: Log = function (err: string) {
    console.log(err);
};

logError(`test`);

// can also describe types we can index into

interface GarageArray {
    [index: number]: string;
}

let myGarage: GarageArray = ["Ford Fiesta", "Audi A3", "Toyota Prius"];

// you can have both string and number indexers
// but type returned from number indexers
// must be subtype of type returned from string indexer (because myGarage[1] === mygarage["1"])

//// using interfaces to construct classes
// one of most common uses of interfaces

interface CarInterfaceNew {
    power: number;
    speed: number;
    accelerate(t: number): void;
}

// we ensure our class abides by rules of our interface
class FastCar implements CarInterfaceNew {
    speed: number = 0;
    constructor(public power: number) {}

    accelerate(time: number): void {
        this.speed = this.speed + 0.5 * this.power * time;
    }
}

// can have classes built on interface (which is itself built on other interface)

interface CarInterface1 {
    wheels: number;
    colour: string;
}

interface CarInterface2 extends CarInterface1 {
    power: number;
    speed: number;
    accelerate(t: number): void;
}

class CarClass implements CarInterface2 {
    speed: number = 0;
    wheels: number = 4;
    constructor(public power: number, public colour: string) {}

    accelerate(time: number): void {
        this.speed = this.speed + 0.5 * this.power * time;
    }
}
