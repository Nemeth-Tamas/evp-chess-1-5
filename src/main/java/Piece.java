public class Piece extends BoardElement{
    public Color color;
    public Type visualType;
    public Type movementType;
    public boolean isKing;

    Piece(Color color, Type visualType, Type movementType, boolean isKing){
        isEmpty = false;
        this.color = color;
        this.visualType = visualType;
        this.movementType = movementType;
        this.isKing = isKing;
    }
}

enum Type{
    PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
}

enum Color{
    WHITE, BLACK
}