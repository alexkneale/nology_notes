// have to declare variables within class with types

class Car {
    wheels: number;
    power: number;
    speed: number = 0;

    // constructor -- constructs instance of class
    constructor(wheels: number, power: number) {
        // .this is used to inidicate ARGUMENTS (what is actually inputted)
        // without .this --> PARAMETERS
        this.wheels = wheels;
        this.power = power;
    }

    accelerate(time: number) {
        this.speed = this.speed + 0.5 * this.power * time;
    }
}

// must include "new" keyword
let myCar = new Car(4, 20); // constructor called

// extends and super keywords allow sub-classing
class Vehicle {
    wheels: number;
    power: number;
    speed: number = 0;

    // constructor -- constructs instance of class
    constructor(wheels: number, power: number) {
        // .this is used to inidicate ARGUMENTS (what is actually inputted)
        // without .this --> PARAMETERS
        this.wheels = wheels;
        this.power = power;
    }

    accelerate(time: number) {
        this.speed = this.speed + 0.5 * this.power * time;
    }
}

class Car2 extends Vehicle {
    gps: boolean;
    constructor(wheels, power) {
        super(wheels, power); // call parent constructor
        this.gps = true; // GPS as standard
    }
}

// TS, unlike JS, has implementation of public, private and protected
// public is default behaviour but can be specified
// private modifier prevents access from outside the class

class Car3 {
    private wheels: number;
    protected power: number;
    private speed: number = 0;

    // constructor -- constructs instance of class
    constructor(wheels: number, power: number) {
        // .this is used to inidicate ARGUMENTS (what is actually inputted)
        // without .this --> PARAMETERS
        this.wheels = wheels;
        this.power = power;
    }

    public accelerate(time: number) {
        this.speed = this.speed + 0.5 * this.power * time;
    }
}

let myCar3 = new Car3(4, 30);

// error, speed is private
// console.log(myCar3.speed)

// protected modifier acts much like private
// excetp protected memebers can be accessed by derived classes

class Car4 extends Car3 {
    gps: boolean;
    constructor(wheels, power) {
        super(wheels, power);
    }
    public showPower() {
        return `Current power: ${this.power}`;
    }
}
let myCar4 = new Car4(4, 20);
// no error, as accessing within class (print statement within class)
console.log(myCar4.showPower());
// error, as trying to access outside of class
//console.log(myCar4.power);

// we can protect constructors to enable
// extension but not instantiation

class CarProtectedConstructor {
    protected wheels: number;
    protected power: number;
    protected speed: number = 0;

    // constructor -- constructs instance of class
    protected constructor(wheels: number, power: number) {
        // .this is used to inidicate ARGUMENTS (what is actually inputted)
        // without .this --> PARAMETERS
        this.wheels = wheels;
        this.power = power;
    }

    accelerate(time: number) {
        this.speed = this.speed + 0.5 * this.power * time;
    }
}

class CarExtension extends CarProtectedConstructor {
    gps: boolean;
    constructor(wheels, power) {
        super(wheels, power);
    }
    public showPower() {
        return `Current power: ${this.power}`;
    }
}

// can construct extension
let CarExtended = new CarExtension(4, 20);
// but not original
// this would cause error, constructor is protected
//let CarProtected = new CarProtectedConstructor(4, 20);

// shorthand for declaring and assigning class variables
// simply include the access modifier in the
// constructor argument and leave the func body empty

class CarShorthand {
    constructor(
        public wheels: number,
        public power: number,
        public make: string,
        public speed: number = 0
    ) {}
}
let CarShort = new CarShorthand(3, 200, "ford");
console.log(CarShort.speed); // 0

// classes: structural types
// typescript is a structural type system
// if types of all members are compatible, then types are compatible
// except for private and protected members

// readonly properties
// must be initialised at their declaration
// or in the constructor

class CarReadOnly {
    readonly wheels: number;
    readonly power: number;
    readonly speed: number = 0;

    constructor(wheels: number, power: number) {
        this.wheels = wheels;
        this.power = power;
    }
}

let CarRead = new CarReadOnly(3, 40);
// error, readonly properties
//CarRead.wheels = 3;

// parameter properties stop us repeating
// ourselves quite so much by creating and
// initialising a property in one place
// By using a modifier in the parameter we create a property

class CarParameterProperties {
    protected speed: number = 0;

    constructor(readonly wheels: number, readonly power: number) {}
    accelerate(time: number) {
        this.speed = this.speed + 0.5 * this.power * time;
    }
}
class CarParameterPropertiesExtension extends CarParameterProperties {
    readonly gps: Boolean = true;
    constructor(wheels, power) {
        super(wheels, power);
    }
}

let myParamCar = new CarParameterPropertiesExtension(3, 20);
console.log(myParamCar.wheels); //4

//// GETTERS and SETTERS
// changing properties directly can often be a bad idea
// getters and setters allow us to
// - encapsulate our implementation
// - add logic to properties

class CarGetSet {
    private _speed: number = 0;

    constructor(readonly wheels: number, readonly power: number) {}
    get speed(): number {
        return this._speed;
    }
    set speed(newSpeed: number) {
        if (newSpeed && newSpeed > -30 && newSpeed <= 150) {
            this._speed = newSpeed;
        }
    }

    accelerate(time: number) {
        this.speed = this.speed + 0.5 * this.power * time;
    }
}

let myGetSetCar = new CarGetSet(4, 20);
// invokes get func
console.log(myGetSetCar.speed); // 0
// invokes set func
myGetSetCar.speed = 100;
// invokes get func
console.log(myGetSetCar.speed); // 100

// invokes set func
// but since it goes against logic above, we dont set it to 151
myGetSetCar.speed = 151;
// invokes get func
console.log(myGetSetCar.speed); // 100
// error below
// mycGetSetCar._speed = 151;

//// static members
// visible on the class itself rather than on its instances
// useful fro data and behaviour that does not change depending on instance

class CarStatic {
    private speed: number = 0;
    static count: number = 0;

    constructor(readonly wheels: number, readonly power: number) {
        CarStatic.count += 1;
    }

    accelerate(time: number) {
        this.speed = this.speed + 0.5 * this.power * time;
    }
}

for (let i = 0; i < 10; i++) {
    new CarStatic(4, 20);
}

console.log(CarStatic.count); //10

//// Abstract Classes
// allow us to create base classes from which
// other classes may be derived
// abstract classes cannot be instantiated themselves
// abstract classes provide implementation details

abstract class CarAbstract {
    wheels: number;
    power: number;
    speed: number = 0;
    constructor(wheels: number, power: number) {
        this.wheels = wheels;
        this.power = power;
    }

    abstract accelerate(time: number): void;
}

class CarAbstractExtension extends CarAbstract {
    constructor(wheels, power) {
        super(wheels, power);
    }
    public accelerate(time: number): void {
        this.speed = this.speed + 0.5 * this.power * time;
    }
}

let myNonAbstract = new CarAbstractExtension(3, 20);
myNonAbstract.accelerate(5);
