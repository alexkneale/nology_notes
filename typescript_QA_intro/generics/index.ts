//// generics
// a tool we can use to create reusable components
// that work over a variety of data types, rather than a single one

//// Generic Functions
// using special type variables identiifed with <>,
// we can create a generic function that
// can accept (and capture!) any type

// the function is generic as it works across a range
// of types, and unlike using the any type, it retains precision

function logVehicle<T>(vehicle: T): T {
    console.log(vehicle);
    return vehicle;
}

// we can then call the function stating the type or allowing inference

let loggedVehicle = logVehicle<Car>(myCar); //specified
let loggedVehicle2 = logVehicle(myCar); // inferred

// bear in mind that T can be any type
// so we have to treat it as such

function logVehicle2<T>(vehicle: T): T {
    // would throw error
    // as not all types have a member called length
    //console.log(vehicle.length);
    return vehicle;
}

//// Generic Interfaces
// often to describe objects that will be generics themselves

interface VehicleStorage<T> {
    vehicles: T[];
    park: (arg: T) => T[];
}

//// Generic Classes
// similar syntax to generic interfaces
// generic classes are only generic on their instance side
// so static members cannot use the class's type parameter

class VehicleGarage<T> {
    vehicles: T[] = [];
    constructor(public space: number = 5) {}
}

//// Generic Constraints
// can constrain generics to only accept types within certain parameters
// whereas until now we've had to work with our generics as if they were 
// accepting any types, we can now owrk with them in certain conditions

interface RoadVehicle {
    height: number;
    weight: number;
}

class VehicleGarage2<T implements RoadVehicle> 
{
    vehicles: T[] = [];
    CarProtectedConstructor(public space: number = 5) {}
}