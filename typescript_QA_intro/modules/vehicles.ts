// any declaration can be exported through using the export keyword

export interface Vehicle {
    wheels: number;
    make: string;
    model: string;
    accelerate(t:number) : number;
}

class Car implements Vehicle {
    wheels = 4;
    constructor(
        public make: string,
        public model: string)
    {}
    accelerate(time: number) {...}
}

// can export under a different name
export {Car as BaseCar};