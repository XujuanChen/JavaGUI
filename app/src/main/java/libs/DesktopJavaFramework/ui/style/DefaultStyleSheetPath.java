package libs.DesktopJavaFramework.ui.style;

public enum DefaultStyleSheetPath {
    WELCOME_DIALOG("css/welcome.css"),
    APP("css/app_style.css");

    private String filePath;
    DefaultStyleSheetPath(String path){
        this.filePath = path;
    }

    public String getFilePath() {
        return filePath;
    }
}
