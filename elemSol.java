    int elementoSolitarioAux(int[] vector, int i0, int iN) {
        if (i0 == iN)
            return vector[i0];
        else {
            int k = (i0 + iN) / 2;
            if (vector[k - 1] == vector[k])
                //Se encuentra en [i0...k-2] o bien en [k+1...iN]
                if ((k - 2 - i0 + 1) % 2 == 0)
                    return elementoSolitarioAux(vector, k + 1, iN);
                else
                    return elementoSolitarioAux(vector, i0, k - 2);
            else if (vector[k] == vector[k + 1])
                //Se encuentra en [i0...k-1] o bien en [k+2...iN]
                if ((k - 1 - i0 + 1) % 2 == 0)
                    return elementoSolitarioAux(vector, k + 2, iN);
                else
                    return elementoSolitarioAux(vector, i0, k - 1);
            else
                return vector[k];
        }
    }

    int elementoSolitario(int[] vector) {
        return elementoSolitarioAux(vector, 0, vector.length - 1);
    }
