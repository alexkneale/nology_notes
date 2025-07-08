//// DECORATORS
// provide means through which exisiting classes and class members can be annotated and modified
// simply a way of wrapping (decorating) one piece of code with another
// decorators use a special @expression syntax, where the expressiono evaluates to a function
// which takes info about decorate declaration

function simpleDecorator(target: any) {
    console.log("my first decorator was called");
}
// our (class) decorator takes the constructor as its only argument and simply logs the message
// to the console
// we dont need to instantiate the class for the decorator to run!
@simpleDecorator
class DecoratedClass {}

// Decorate Factories
// can use to be able to provide our decorators with params
// NB decorator should evaluate to a func

function DecoratorFactory(name: string) {
    return function (target: Function) {
        console.log(`${name} decorator was called`);
    };
}

@DecoratorFactory("factory")
class DecoratedClasss {}

// the runtime automatically passes the params ot the evaluated func of our decorators
// in case of class decorator, this is constructor func itself
