package commands;

public class Help extends Command{
    public String execute(){
        return "Move using \"move\" and then \"up/left/right/down\"\nCheck inventory using \"inventory\"\nUse item by typing \"item\" and then the items name\nOpen shop by using \"shop\" (you need to be in a shop room)\nBuy in shop using \"buy\" and then the item name\nFight using \"fight\"\nUse a spell using \"spell\" and then the spell name\nCheck map using \"map\"";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
