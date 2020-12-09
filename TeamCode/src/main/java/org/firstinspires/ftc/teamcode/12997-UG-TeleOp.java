package org.firstinspires.ftc.robotcontroller.external.samples;
 
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
 
//this line adds the program to the driver station, you can change the name 
@TeleOp(name="12997-UG-TeleOp", group="Linear Opmode")
//@Disabled
//change the name of the program below
public class 12997-UG-TeleOp extends LinearOpMode {
  
  /*******************************
  1) DECLARE Devices and Variables
  *******************************/
  private ElapsedTime runtime = new ElapsedTime();

  //Sample Declarations
  private DcMotor leftFront;
  private Servo leftServo;

  //shooter
  //Declarations
  DcMotor shooterRight;
  DcMotor shooterLeft;
  
  //Intake
  DcMotor intakeMiddle;
  Servo  intakeLeft;
  Servo intakeRight;
  //can u send the link to the doc with what we named our servos in our chat or right here? Thanks! And Mr. Witman, also can u come to see if I built my intake and shooter parts correctly?
  
  //Wobble Goal
  DcMotor wobbleGoalLift;
  Servo wobbleGoalPivot;
  Servo wobbleGoalClaw;
  
  //Drivetrain
  DcMotor drivetrainFrontLeft;
  DcMotor drivetrainFrontRight;
  DCMotor drivetrainBackLeft;
  DcMotor drivetrainBackRight;
  
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
    
    //shooter
    shooterRight = hardwareMap.get(DcMotor.class, "shooterRight");
    shooterLeft = hardwareMap.get(DcMotor.class, "shooterLeft");

    //Drivetrain
    leftFront = hardwareMap.get(DcMotor.class, "drivetrainFrontLeft");
    leftRight = hardwareMap.get(DcMotor.class, "drivetrainFrontRight");
    leftBack = hardwareMap.get(DcMotor.class, "drivetrainBackLeft")
    
    //Intake...

    //Wobble Goal
    wobbleGoalClaw = hardwareMap.get(Servo.class, "wobbleGoalClaw");
    wobbleGoalPivot = hardwareMap.get
    (Servo.class, "wobbleGoalPivot")
    wobbleGoalLift = hardwareMap.get(DcMotor.class,"wobbleGoalPivot");

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
    
      //shooter
      if(gamepad2.c){
        shooterRight.
      }
    
      //Intake...

      //Wobble Goal
      if
  
      // Show the elapsed game time and wheel power.
      telemetry.addData("Status", "Run Time: " + runtime.toString());
      telemetry.update();
    }
  }
}
