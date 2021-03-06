/*******************************************************************************
 * Copyright (c) MOBAC developers
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package mobac.program.atlascreators.impl.rmp.rmpfile;

public class Bmp4bit extends GeneralRmpFileEntry {
	private static final byte[] content = { 73, 99, 111, 110, 32, 102, 105, 108, 101, 32, 118, 101,
			114, 115, 105, 111, 110, 32, 49, 46, 48, 46, 48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0,
			0, 1, 0, 0, 60, 0, 0, 0, -16, -1, -1, 127, 88, 1, 0, 0, -15, -1, -1, 127, -12, 1, 0, 0,
			0, 1, 0, 0, -1, -1, -1, -1, 88, 0, 0, 0, -40, 0, 0, 0, 0, 0, 0, 0, 16, 0, 16, 0, 4, 4,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 51, 51, 51, 51, 51, 51, 48, 3, 0, 0, 0, 0, 0, 0, 48,
			3, 0, 0, 0, 0, 0, 0, 48, 3, 0, 0, 0, 0, 0, 0, 48, 3, 0, 0, 0, 0, 0, 0, 48, 3, 0, 0, 0,
			0, 0, 0, 48, 3, 0, 0, 0, 0, 0, 0, 48, 3, 0, 0, 0, 0, 0, 0, 48, 3, 0, 0, 0, 0, 0, 0, 48,
			3, 0, 0, 0, 0, 0, 0, 48, 3, 0, 0, 0, 0, 0, 0, 48, 3, 0, 0, 0, 0, 0, 0, 48, 3, 0, 0, 0,
			0, 0, 0, 48, 3, 51, 51, 51, 51, 51, 51, 48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, -1, -1, -1, -1, -16, 0, 0,
			15, -1, -1, -1, -1, -16, 0, 0, 15, -1, -1, -1, -1, -16, 0, 0, 15, -1, -1, -1, -1, -16,
			0, 0, 15, -1, -1, -1, -1, -16, 0, 0, 15, -1, -1, -1, -1, -16, 0, 0, 15, -1, -1, -1, -1,
			-16, 0, 0, 15, -1, -1, -1, -1, -16, 0, 0, 15, -1, -1, -1, -1, -16, 0, 0, 15, -1, -1,
			-1, -1, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			-16, -1, -1, 127, -1, -1, -1, -1, 116, 1, 0, 0, -76, 1, 0, 0, 0, 0, 0, 0, 1, 0, 64, 0,
			4, 8, 0, 0, 81, -3, -40, -70, -124, 24, -99, -19, 46, -36, -3, -21, -128, 98, 96, -75,
			82, -99, 78, 108, -79, 18, -9, -36, -20, -88, -41, 84, -99, 88, 98, 40, 74, 93, 118,
			-31, -73, -62, -98, -43, -41, 12, -75, 60, 69, 54, -54, -40, 51, -73, -18, 36, 83, 86,
			-8, 80, -2, 105, -61, -122, 37, 114, 7, -7, 0, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1,
			-1, -1, -1, 0, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1,
			-1, -1, 0, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1,
			-1, 0, -1, -1, -1, -1, -1, -1, 0, -15, -1, -1, 127, -1, -1, -1, -1, 16, 2, 0, 0, 40, 2,
			0, 0, 0, 0, 0, 0, 1, 0, 24, 0, 4, 8, 0, 0, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 97,
			98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0, -1, -1, -1, -1, -1,
			-1, 0, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, 0, -1, -1 };

	public Bmp4bit() {
		super(content, "bmp4bit", "ics");
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + getFileName() + "." + getFileExtension();
	}

}
