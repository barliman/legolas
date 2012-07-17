/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package shire.sort;

import java.util.List;

public class InsertionSort<T extends Comparable<? super T>> implements ISort<T> {

	@Override
	public List<T> sort(final List<T> A) {
		for (int i = 1; i < A.size(); i++) {
			T key = A.get(i);
			int j;

			for (j = i - 1; j >= 0; j--)
				if (A.get(j).compareTo(key) > 0)
					A.set(j + 1, A.get(j));
				else
					break;

			A.set(j + 1, key);
		}
		return A;
	}
}
