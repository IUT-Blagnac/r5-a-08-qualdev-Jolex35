
import * as fs from 'fs';
import {Given, Then, When} from "@cucumber/cucumber";

let fileContent: string;

Given('I want to ensure that my React files have a default export', function () {
    // You can add configurations or initializations here if needed
    return 'pending'
});

When('I check the React file {string}', function (fileName: string) {
    fileContent = fs.readFileSync(fileName, 'utf8');
});

Then('I should find the {string} statement', function (statement: string) {
    const hasExportDefault = fileContent.includes(statement);
    if (!hasExportDefault) {
        throw new Error('The "export default" statement was not found in the file.');
    }
});