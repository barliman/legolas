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

public class QuickSort<T extends Comparable<? super T>> implements ISort<T> {

	@Override
	public List<T> sort(final List<T> A) {
		return this.qSort(A, 0, A.size() - 1);
	}

	private List<T> qSort(final List<T> A, final int p, final int r) {
		if (p < r) {
			int q = this.partition(A, p, r, this.getPivot(p, r));
			this.qSort(A, p, q - 1);
			this.qSort(A, q + 1, r);
		}
		return A;
	}

	private int partition(final List<T> A, final int p, final int r,
			final int pivotIndex) {

		T pivot = A.get(pivotIndex);
		A.set(pivotIndex, A.get(r));
		A.set(r, pivot);

		int storeIndex = p;

		for (int i = p; i < r; i++) {
			if (A.get(i).compareTo(pivot) < 0) {
				T temp = A.get(i);
				A.set(i, A.get(storeIndex));
				A.set(storeIndex, temp);
				storeIndex++;
			}
		}

		T temp = A.get(storeIndex);
		A.set(storeIndex, A.get(r));
		A.set(r, temp);

		return storeIndex;
	}

	private int getPivot(final int p, final int r) {
		return r;
	}

}
