import java.awt.*;

//Jogo recriado por Silésio Leudério Cipriano
public class Player {
    public boolean right,left;
    public int x,y;
    public int width,height;
    public Player(int x,int y){
        this.x=x;
        this.y=y;
        this.width=40;
        this.height=10;
    }
    public void tick(){
        if(right){
            x++;
        }else if(left){
            x--;
        }
        if(x+width>Game.WIDTH){
            x=Game.WIDTH-width;
        }else if(x<0){
            x=0;
        }

    }
    public void render(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x,y,40,10);
    };
}

//Jogo recriado por Silésio Leudério Cipriano
