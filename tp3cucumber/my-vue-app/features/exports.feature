Feature: Checking for the "export default" statement in React files

  Scenario Outline: Verify the presence of "export default" in a React file
    Given I want to ensure that my React files have a default export
    When I check the React file "<file_name>"
    Then I should find the "<statement>" statement
    Examples:
      | file_name | statement |
      | index.tsx | export default |