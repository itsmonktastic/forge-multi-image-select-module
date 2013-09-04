/* This file was generated as part of a ForgeModule.
 *
 * You may move this file to another package if you require, however do not modify its contents.
 * To add more resources rebuild the inspector project.
 */

package io.trigger.forge.android.module.tribr_multi_image_select;

import java.lang.reflect.Field;

public class R {
    public static class attr {
        static {
            try {
                Class<?> realR = Class.forName("io.trigger.forge.android.inspector.R");
                for (Class<?> c : realR.getClasses()) {
                    if (c.getSimpleName().equals("attr")) {
                        for (Field f : attr.class.getDeclaredFields()) {
                            try {
                                f.set(null, c.getDeclaredField(f.getName()).get(null));
                            } catch (IllegalArgumentException e) {
                            } catch (IllegalAccessException e) {
                            } catch (NoSuchFieldException e) {
                            }
                        }
                        break;
                    }
                }               
            } catch (ClassNotFoundException e) {
            }
        }
    }
    public static class drawable {
        public static int multi_image_select_error=0x7f020000;
        public static int multi_image_select_loading=0x7f020001;
        static {
            try {
                Class<?> realR = Class.forName("io.trigger.forge.android.inspector.R");
                for (Class<?> c : realR.getClasses()) {
                    if (c.getSimpleName().equals("drawable")) {
                        for (Field f : drawable.class.getDeclaredFields()) {
                            try {
                                f.set(null, c.getDeclaredField(f.getName()).get(null));
                            } catch (IllegalArgumentException e) {
                            } catch (IllegalAccessException e) {
                            } catch (NoSuchFieldException e) {
                            }
                        }
                        break;
                    }
                }               
            } catch (ClassNotFoundException e) {
            }
        }
    }
}
