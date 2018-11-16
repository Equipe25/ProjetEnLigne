package amzevent.Domaine;

import amzevent.Domaine.Util.Vector2F;

public class Scene {
    private Vector2F dimension;
    private Vector2F position;
    private float orientation;
    
    public Scene(Vector2F dimension, Vector2F position) {
        this.dimension = dimension;  
        this.position = position;
        orientation = 0.0f;
    }
    
    public Vector2F getDimension() {
        return dimension;
    }
    
    public void setDimension(Vector2F dimension) {
        this.dimension = dimension;
    }
    
    public Vector2F getCenter()
    {
        return new Vector2F(position.x + dimension.x / 2.0f,
                            position.y + dimension.y / 2.0f);
    }
    
    public Vector2F getPosition() {
        return position;
    }
    
    public void setPosition(Vector2F position) {
        this.position = position;
    }
        
    public float getOrientation() {
        return orientation;
    }
    
    public void setOrientation(float orientation) {
        this.orientation = orientation;
    }
}
