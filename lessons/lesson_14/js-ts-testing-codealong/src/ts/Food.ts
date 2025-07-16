export type Food = {
  img: string;
  name: string;
  foodType: FoodType;
  rating: number;
};

// Enums are used to define a set of named constants, think of these as or unchangeable variables.
// https://www.typescriptlang.org/docs/handbook/enums.html#string-enums
export enum FoodType {
  JUNK = "junk",
  HEALTHY = "healthy",
}
