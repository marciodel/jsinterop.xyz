package xyz.jsinterop.client.dom;

import jsinterop.annotations.JsPackage;

/*
 * #%L
 * jsinterop
 * %%
 * Copyright (C) 2016 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface SVGPathSegCurvetoCubicAbs extends SVGPathSeg {
	@JsProperty
	public abstract double getX();

	@JsProperty
	public abstract void setX(final double value);

	@JsProperty
	public abstract double getX1();

	@JsProperty
	public abstract void setX1(final double value);

	@JsProperty
	public abstract double getX2();

	@JsProperty
	public abstract void setX2(final double value);

	@JsProperty
	public abstract double getY();

	@JsProperty
	public abstract void setY(final double value);

	@JsProperty
	public abstract double getY1();

	@JsProperty
	public abstract void setY1(final double value);

	@JsProperty
	public abstract double getY2();

	@JsProperty
	public abstract void setY2(final double value);
}
