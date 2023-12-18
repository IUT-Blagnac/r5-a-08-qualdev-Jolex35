package hellocucumber;

class IsItFriday {
    private String today;
    private String isItFriday;

    IsItFriday(String today) {
        this.today = today;
    }

    void checkIfIsItFriday() {
        if (today.equals("Friday")) {
            isItFriday = "TGIF";
        } else {
            isItFriday = "Nope";
        }
    }

    String getIsItFriday() {
        return isItFriday;
    }
}