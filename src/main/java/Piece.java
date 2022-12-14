public class Piece extends BoardElement{
    public Color color;
    public Type look;
    public MoveSet movement;
    public boolean isKing;

    Piece(Color color, Type look, MoveSet movement, boolean isKing){
        isEmpty = false;
        this.color = color;
        this.look = look;
        this.movement = movement;
        this.isKing = isKing;
    }
}

enum Type{
    PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
}

enum Color{
    WHITE, BLACK
}