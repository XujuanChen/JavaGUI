package libs.DesktopJavaFramework.ui.style;

import libs.PropertiesManager.src.PropertiesManager;
import libs.DesktopJavaFramework.AppPropertyType;

import java.io.File;
import java.nio.file.Path;

public class CssLoader {

    public static String loadCss(DefaultStyleSheetPath path, PropertiesManager propertiesManager){
        final String defaultPath = path.getFilePath();
        String pathFromXml = propertiesManager.getProperty(path.toString());
        File f = new File(pathFromXml);
        if(!f.exists()) return defaultPath;
        return pathFromXml;
    }

    public static String loadCss(AppPropertyType pathEnum, PropertiesManager propertiesManager) {
        String pathFromXml = propertiesManager.getProperty(pathEnum.toString()) + propertiesManager.getProperty(AppPropertyType.APP_CSS);
        File f = new File(pathFromXml);
        if(f.exists()) return Path.of(pathFromXml).toUri().toString();
        switch (pathEnum){
            case APP_PATH_CSS: return String.format("file:%s",  DefaultStyleSheetPath.APP.getFilePath());
        }
        return "";
    }
}
