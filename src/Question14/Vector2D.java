package Question14;

public class Vector2D {
    private float x;
    private float y;
    private float z;

    Vector2D(float x,float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Add two vectors together
    public Vector2D add(Vector2D v) {
        return new Vector2D(x + v.x, y + v.y, z + v.z);
    }



    // Subtract two vectors
    public Vector2D subtract(Vector2D v) {
        return new Vector2D(x - v.x, y - v.y, z - v.z);
    }

    // Scale a vector by a scalar
    public Vector2D scale(float scalar) {
        return new Vector2D(scalar * x, scalar * y, scalar * z);
    }


    // Dot product of two vectors
    public float dot(Vector2D v) {
        return x * v.x + y * v.y + z * v.z;
        
    }

    // Magnitude of a vector
    public float magnitude() {
        return (float)Math.sqrt(x * x + y * y + z * z);
    }

    // Normalise a vector
    public Vector2D normalised() {
        float magnitude = this.magnitude();
        return new Vector2D(x / magnitude, y / magnitude, z / magnitude);
    }
    

}
