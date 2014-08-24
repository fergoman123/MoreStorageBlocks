package fergoman123.mods.msb.reference;

import scala.actors.threadpool.Arrays;

import java.util.List;

public class ModInfo
{
    public static final String modid = "MSB";
    public static final String name = "More Storage Blocks";
    public static final String versionMain = "1.0";
    public static final String version = "@version@";
    public static final String[] authorList = {"Fergoman123"};
    public static final List<String> authors = Arrays.asList(authorList);
    public static final String url = "fergoman123.github.io";
    public static final String updateUrl = "fergoman123.github.io/msb.html";
    public static final String desc = "Adds More Storage Blocks to Minecraft";
    public static final String logoFile = "/assets/msb/textures/art/logo.png";

    public static final String dep = "required-after:FergoUtil";
}
