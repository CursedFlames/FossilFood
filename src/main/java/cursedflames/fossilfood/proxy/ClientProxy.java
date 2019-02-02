package cursedflames.fossilfood.proxy;

import net.minecraft.client.resources.I18n;

public class ClientProxy implements ISideProxy {
	@Override
	public String translateWithArgs(String string, Object... args) {
		return I18n.format(string, args);
	}

	// TODO escape formatting properly instead of doing this
	@SuppressWarnings("deprecation")
	@Override
	public String translate(String string) {
		return net.minecraft.util.text.translation.I18n.translateToLocal(string);
	}

	@Override
	public boolean hasTranslationKey(String string) {
		return I18n.hasKey(string);
	}
}
