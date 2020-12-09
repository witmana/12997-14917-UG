package org.firstinspires.ftc.robotcontroller.external.samples;
 
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
//this line adds the program to the driver station, you can change the name 
@TeleOp(name="14917-UG-TeleOp", group="Linear Opmode")
//@Disabled
//change the name of the program below
public class 14917-UG-TeleOp extends LinearOpMode {
  /*******************************
  1) DECLARE Devices and Variables
  *******************************/
  private ElapsedTime runtime = new ElapsedTime();

  //Sample Declarations
  private DcMotor leftFront;
  private Servo leftServo;

  //Drivetrain
  DcMotor driveLeftFront;
  DcMotor driveLeftBack;
  DcMotor driveRightFront;
  DcMotor driveRightBack;

  //Intake
  DcMotor shooterFrontLeft;
  DcMotor shooterFrontRight;
  DcMotor intakeRightMiddle;
  Servo intakeRightBack;
  Servo intakeLeftBack;

  //Wobble
  DcMotor linearSlide;
  Servo fourBarRight;
  Servo fourBarLeft;
  Servo rackPinion
  
  @Override
  public void runOpMode() {
    telemetry.addData("Status", "Initialized");
    telemetry.update();
  
    // Initialize the hardware variables. Note that the strings used here as parameters
    // to 'get' must correspond to the names assigned during the robot configuration // step (using the FTC Robot Controller app on the phone).
    
    /*******************************
    2) Initialize Devices and Variables
    *******************************/
    //Sample Initializations
    leftFront  = hardwareMap.get(DcMotor.class, "drivetrainFrontLeft");
    leftServo = hardwareMap.get(Servo.class, "leftservo");
    
    //Drivetrain
    driveLeftFront=hardwareMap.get(DcMotor.class, "driveLeftFront");
    driveRightFront=hardwareMap.get(DcMotor.class,"driveRightFront");
    driveLeftBack=hardwareMap.get(DcMotor.class, "driveLeftBack");
    driveRightBack=hardwareMap.get(DcMotor.class,"driveRightBack");
    
    //Intake...
    shooterFrontLeft=hardwareMap.get(DcMotor.class, "shooterFrontLeft");
    shooterFrontRight=hardwareMap.get(DcMotor.class, "shooterFrontRight");
    intakeRightMiddle=hardwareMap.get(DcMotor.class, "intakeRightMiddle");
    intakeRightBack=hardwareMap.get(Servo.class, "intakeRightBack");
    intakeLeftBack=hardwareMap.get(Servo.class, "intakeLeftBack");
    
    // Wobble Goal
    linearSlide=hardwareMap.get(DcMotor.class "linearSlide")
    fourBarRight=hardwareMap.get(Servo.class "fourBarRight")
    fourBarLeft=hardwareMap.get(Servo.class "fourBarLeft")
    rackPinion=hardwareMap.get(Servo.class "rackPinion")


    
    // Most robots need the motor on one side to be reversed to drive forward
    //leftDrive.setDirection(DcMotor.Direction.FORWARD);
    //rightDrive.setDirection(DcMotor.Direction.REVERSE);

    // Wait for the game to start (driver presses PLAY)
    waitForStart();
    runtime.reset();

    // run until the end of the match (driver presses STOP)
    while (opModeIsActive()) {
    /*******************************
    3) Respond to Gamepad
    *******************************/
      //sample if statement
      if(gamepad1.a){
        leftServo.setPosition(0.5);
      }else{
        leftServo.setPosition(0);
      }
    
      //Drivetrain
    
      //Intake...
      
      
  
      // Show the elapsed game time and wheel power.
      telemetry.addData("Status", "Run Time: " + runtime.toString());
      telemetry.update();
    }
  }
}
