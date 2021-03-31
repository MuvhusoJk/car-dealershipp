
/**
 *
 * @author jake
 */
public class modelDetails extends Model {
    
    String driveType;
    int doors;
    String color;
    String driveTrain;
    
    /**
     *
     */
    public modelDetails() {
		this.driveType = "unkown";
		this.doors = 0;
		this.color = "unknown";
		this.driveTrain = "unknown";
	}


	public String getDriveType() {
		return driveType;
	}

	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
        
        public String getDriveTrain(){
            return driveTrain;
        }
        public void setDriveTrain( String driveTrain){
            this.driveTrain = driveTrain;
        }

 
    }
