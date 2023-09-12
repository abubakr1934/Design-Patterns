public class Tic_tac_toe implements Prototype{
    String board_material;
    int no_of_boxes;
    String color;


    Tic_tac_toe(String board_material,int no_of_boxes,String color)
    {
        this.board_material=board_material;
        this.no_of_boxes=no_of_boxes;
        this.color=color;

        System.out.println("tic tac toe board created");
    }
    @Override
    public Prototype getclone() {
        return new Tic_tac_toe(this.board_material,this.no_of_boxes,this.color);
    }

    void show_details(){
        System.out.println("board material "+this.board_material+" no of boxes "+this.no_of_boxes+" and color is "+this.color);
    }
}
