// "internal modules" called "namespaces", "external modules" called "modules"

// modules run in their own scope
// avoiding pollution of the global scope

// only what is exported is exposed externally
// only what is imported is usable internally

// example of importing below
import { Vehicle, BaseCar } from "./vehicles";
// changing name
import { BaseCar as BasicCar } from "./vehicles";
// import all
import * as vehicles from "./vehicles";
