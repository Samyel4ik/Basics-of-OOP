package Task6;


import java.util.List;

public class Gift {
    List<Sweetness> list;
    Packaging packaging;


    public Sweetness newSweetness (String addSweets){
        Sweetness sweetness = null;

        for (int i = 0; i < this.list.size(); i++) {
            if (addSweets.equalsIgnoreCase(this.list.get(i).getName())){
                sweetness = this.list.get(i);
            }
        }
        return sweetness;
    }

    public void addSweetness (String addSweets){
        this.list.add(newSweetness(addSweets));

    }
    public void setGift(List<Sweetness> list, Packaging packaging) {
        this.list = list;
        this.packaging = packaging;

    }

    public List<Sweetness> getList() {
        return list;
    }


    @Override
    public String toString() {
        return "Gift{" +
                "list=" + list +
                ", packaging=" + packaging +
                '}';
    }
}
