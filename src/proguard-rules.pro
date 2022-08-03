# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.aemo.slackview.SlackView {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/aemo/slackview/repack'
-flattenpackagehierarchy
-dontpreverify
