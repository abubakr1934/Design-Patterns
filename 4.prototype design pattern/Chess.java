public class Chess implements Prototype{
    String board_material;
    int no_of_boxes;
    String color;
    int no_of_pieces;

    Chess(String board_material,int no_of_boxes,String color,int no_of_pieces)
    {
        this.board_material=board_material;
        this.no_of_boxes=no_of_boxes;
        this.color=color;
        this.no_of_pieces=no_of_pieces;
        System.out.println("chess board created");
    }

    @Override
    public Prototype getclone() {
        System.out.println("cloned chess board");
        return new Chess(this.board_material,this.no_of_boxes,this.color,this.no_of_pieces);
    }
    void show_details(){
        System.out.println("board material "+this.board_material+" no of boxes "+this.no_of_boxes+" and color is "+this.color+" and no of pieces are "+this.no_of_pieces);
    }
}