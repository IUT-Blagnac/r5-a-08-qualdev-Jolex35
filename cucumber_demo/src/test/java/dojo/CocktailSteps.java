package dojo;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CocktailSteps {
    private Order order;
    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String from) {
        order = new Order();
        order.declareOwner(from);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_juliette(String to) {
        order.declareTarget(to);
    }

    @Then("there is {int} cocktail in the order")
    public void there_is_cocktail_in_the_order(int nbCocktails) {
        List<String> cocktails =  order.getCocktails();
        assertEquals(nbCocktails, cocktails.size());
        throw new PendingException();
    }

    @And("a message saying {string} is added")
    public void aMessageSayingIsAdded(String arg0) {
        order.setMessage(arg0);
    }

    @Then("the ticket must say {string}")
    public void theTicketMustSay(String arg0) {
        assertEquals(arg0, order.getMessage());
    }
}
