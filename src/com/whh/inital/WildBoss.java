package com.whh.inital;

import com.whh.character.Boss;

public class WildBoss {
	// Ò°Éú±¦¿ÉÃÎÊôĞÔsprintBoss
		public static void sprintBoss(Boss b) {
			System.out.println("Ãû×Ö£º" + b.getName());
			System.out.println("µÈ¼¶£º" + b.getLe());
			System.out.println("ÉúÃüÖµ£º" + b.getBlood());
			System.out.println("¹¥»÷£º" + b.getStract());
			System.out.println("·ÀÓù£º" + b.getProtect());
		}
		// Ò°Éú±¦¿ÉÃÎbossSet
			public static void bossSet(Boss b, int num) {
				if (num == 1) {
					b.setName("·ÉÌìó«òë");
					b.setTrick("·Éµ¯Õë");
				} else if (num == 2) {
					b.setName("°Í´óµû");
					b.setTrick("³¬Òô²¨");
				} else if (num == 3) {
					b.setName("Ìú¿ÇÓ¼");
					b.setTrick("µçÍø");
				} else {
					b.setName("±È±ÈÄñ");
					b.setTrick("³á°ò¹¥»÷");
				}
				System.out.println("Å¼Óö" + b.getName());
			}
}
