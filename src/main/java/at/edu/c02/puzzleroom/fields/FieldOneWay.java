package at.edu.c02.puzzleroom.fields;

import at.edu.c02.puzzleroom.Direction;
import at.edu.c02.puzzleroom.GameBoard;

import javax.naming.Name;


public class FieldOneWay extends BaseField{


        public FieldOneWay(GameBoard gameBoard, char name, int row, int col) {
            super(gameBoard, name, row, col);
        }

        public void initialize() {
        }

        public boolean enterField(Direction direction) {
            gameBoard.getPlayer().walkStep();
            setPlayerPositionToField();
            return true;
        }

        public boolean leaveField(Direction direction) {
            switch(name) {
                case '<': return direction == Direction.Left;
                case '^': return direction == Direction.Up;
                case '>': return direction == Direction.Right;
                case 'v': return direction == Direction.Down;

            }
            return false;
        }
    }

