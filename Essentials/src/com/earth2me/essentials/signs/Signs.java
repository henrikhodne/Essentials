package com.earth2me.essentials.signs;


public enum Signs
{
	BALANCE(new SignBalance()),
	BUY(new SignBuy()),
	DISPOSAL(new SignDisposal()),
	FREE(new SignFree()),
	HEAL(new SignHeal()),
	MAIL(new SignMail()),
	PROTECTION(new SignProtection()),
	SELL(new SignSell()),
	TIME(new SignTime()),
	TRADE(new SignTrade()),
	WARP(new SignWarp()),
	WEATHER(new SignWeather());
	private final EssentialsSign sign;

	private Signs(final EssentialsSign sign)
	{
		this.sign = sign;
	}

	public EssentialsSign getSign()
	{
		return sign;
	}
}
