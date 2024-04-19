import java.awt.*;
public class CommonConstants {
    // file paths
	public static final String RIGHT_PATH = "resources/Right.png";
    public static final String LOGIN_IMAGE_PATH = "resources/Logo.png";
    public static final String FONT_PATH = "resources/segoeuib.ttf";
    
	// color config
    public static final Color PRIMARY_COLOR = new Color(230, 247, 255);
    public static final Color SECONDARY_COLOR = new Color(0,74,173);
    public static final Color BUTTON_COLOR = new Color(56,182,255);
    public static final Color WHITE = new Color(255,255,255);
    // frame config
    public static final Dimension FRAME_SIZE = new Dimension(1500, 805);
    public static final Dimension TEXTFIELD_SIZE = new Dimension((int) (FRAME_SIZE.width * 0.92), 50);
    public static final Dimension BUTTON_SIZE = TEXTFIELD_SIZE;

    // image config
    public static final Dimension LOGIN_IMAGE_SIZE = new Dimension(380, 340);
    public static final Dimension RIGHT_SIZE = new Dimension(400, 500);
    // register config
    public static final Dimension REGISTER_LABEL_SIZE = new Dimension(FRAME_SIZE.width, 130);

    // result dialog config
    public static final Dimension RESULT_DIALOG_SIZE = new Dimension((int)(FRAME_SIZE.width/3), (int)(FRAME_SIZE.height/6));
}