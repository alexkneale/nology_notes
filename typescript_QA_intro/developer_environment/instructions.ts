// On the command line, using the cd command, navigate to your folder.
// 2. Initialise an npm project, accepting all defaults by using the command:
// npm init -y
// 3. Install typescript and the webpack plugin ts-loader for the project using:
// npm i --save-dev typescript ts-loader
// 4. Install Webpack, its CLI and the development server using:
// npm i --save-dev webpack webpack-cli webpack-dev-server
// 5. Amend the package.json file scripts section so that the following replace the
// "test" script:

// "build": "webpack --mode production",
// "dev": "webpack --mode development",
// "start": "webpack serve --open \"Chrome\"",
// "check-types": "tsc"

// 6. Configure webpack by creating the file webpack.config.js and putting the following
// code inside it:
// module.exports = {
//     entry: "./src/index.ts",
//     resolve: {
//         extensions: [".ts", ".js"],
//     },
//     module: {
//         rules: [
//             {
//                 test: /\.ts$/,
//                 use: {
//                     loader: "ts-loader",
//                 },
//             },
//         ],
//     },
// };

// The entry part of this file tells Webpack how to get into our application. The resolve object
// tells Webpack to use both .ts and .js files imported. The module object tells Webpack to
// use the ts-loader when bundling .ts files.
// When the build or dev commands are used, Webpack will create a bundled JS file called
// main.js (minified for build because of --mode production) and place it in a folder called
// dist. When using the development server, a virtual file is created and held on it. The checktypes
// script will simply run the compiler and highlight any TypeScript errors.

// 7. Next, configure TypeScript by creating a tsconfig.json file and putting the following
// inside it:

// {
//     "compilerOptions": {
//     "sourceMap": true,
//     "target": "es5"
//     }
//   }

// This config enables TypeScript and Webpack to allow you to debug the TypeScript files in
// the browser (use the Sources tab and then webpack:// à . à src and then debug from
// the .ts file). It also means that the outputted JavaScript is only ES5 compliant. If you need
// to support ES3 browsers, change this and look into Polyfills!!!

// 8. Create the entry file, index.ts in a new folder called src
// 9. Re-write or copy the contents from QuickLab 1's TypeScript file in index.ts and save.
// 10. Create a new file in the starter folder called index.html.
// 11. Add a skeleton HTML page that as a script tag with a source of main.js.
// This file src will need to be modified when going into a production environment.
// Presently, it enables the development server to run the bundled file.
// 12. On the command line, run the project using:
// npm start
// Your browser should spin up now - check the console and also find the file to debug.
// 13. Experiment with the build and dev commands (insert run after the npm
// command if it doesn't work out of the box).
// 14. Run the check-types script and see the results - i.e. the new files in the src
// folder!
