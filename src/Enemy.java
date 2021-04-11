import java.awt.*;

//Jogo recriado por Silésio Leudério Cipriano
public class Enemy {
    public double x,y;
    public int width,height;

    public Enemy(int x,int y){
        this.x=x;
        this.y=y;
        this.width=40;
        this.height=10;
    }

    public void tick(){
        x+=(Game.ball.x-x-6)*0.2;
    }
    public void render(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect((int)x,(int)y,width,height);
    }
}
//Jogo recriado por Silésio Leudério Cipriano