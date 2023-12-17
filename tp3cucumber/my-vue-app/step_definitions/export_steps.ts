import { Given, When, Then } from 'cucumber';
import * as fs from 'fs';

let fileContent: string;

Given('I want to ensure that my React files have a default export', function () {
    // You can add configurations or initializations here if needed
});

When('I check the React file {string}', function (fileName: string) {
    fileContent = fs.readFileSync(fileName, 'utf8');
});

Then('I should find the "export default" statement', function () {
    const hasExportDefault = fileContent.includes('export default');
    if (!hasExportDefault) {
        throw new Error('The "export default" statement was not found in the file.');
    }
});