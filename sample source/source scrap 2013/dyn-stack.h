/* 
 * File:   dyn-stack.h
 * Author: kaqfa
 *
 * Created on October 11, 2012, 3:10 PM
 */

#ifndef STACKD_H
#define	STACKD_H

#ifdef	__cplusplus
extern "C" {
#endif

    /* File : stack.h */
    /* deklarasi stack yang diimplementasi dengan tabel kontigu */
    /* TOP adalah alamat elemen puncak; */
    /* Implementasi Stack dalam bahasa C dengan alokasi dinamik */
#include "boolean.h"
#define Nil 0
    /* Indeks dalam bhs C dimulai 0, tetapi indeks 0 tidak dipakai */
    typedef int infotype; /* type elemen stack */
    typedef int address;
    /* indeks tabel */
    /* Contoh deklarasi variabel bertypetype stack dengan ciri TOP : */
    /* Versi I : dengan menyimpan tabel dan alamat top secara eksplisit*/

    /* Tabel dialokasi secara dinamik */

    typedef struct {
        infotype *T; /* tabel penyimpan elemen */
        address TOP; /* alamat TOP: elemen puncak */
        int Size;
        /* Ukuran stack */
    } Stack;

    /* Definisi stack S kosong : S.TOP = Nil */
    /* Elemen yang dipakai menyimpan nilai Stack T[1]..T[Size+1] */
    /* Perhatikan definisi ini, dan pakailah untuk mengalokasi T */
    /* dengan benar */
    /* Elemen yang dipakai menyimpan nilai Stack T[1]..T[Size+1] */
    /* Jika S adalah Stack maka akses elemen : */
    /* S.T[(S.TOP)] untuk mengakses elemen TOP */
    /* S.TOP adalah alamat elemen TOP */
    /* Definisi akses : Get dan Set */
#define Top(S) (S).TOP
#define InfoTop(S) (S).T[(S).TOP]
#define Size(S) (S).Size
    /* Perubahan nilai komponen struktur karena implementasi */
    /* dengan macro spt di atas ; tidak perlu direalisasi */

    /********** Prototype **********/
    /*** Konstruktor/Kreator ***/
    void CreateEmpty(Stack *S, int Size){        
        S->T = (int *) malloc(sizeof(int));
        S->TOP = NULL;
        S->Size = Size;
    }    
    /* I.S. sembarang; */
    /* F.S. Membuat sebuah stack S yang kosong berkapasitas Size */
    /* jadi indeksnya antara 1.. Size+1 karena 0 tidak dipakai */
    /* Ciri stack kosong : TOP bernilai Nil */
    /* Destruktor */

    void Destruct(Stack *S){
		free(S->T);
	}
    /* Destruktor: dealokasi seluruh tabel memori sekaligus */
    
    /*********** Predikat Untuk test keadaan KOLEKSI **********/
    boolean IsEmpty(Stack S){
		if(Top(S) == NULL)
			return benar;
		else
			return salah;
	}
    /* Mengirim true jika Stack kosong: lihat definisi di atas */

    boolean IsFull(Stack S){
		if(Top(S) == Size(S))
			return benar;
		else
			return salah;
	}
    /* Mengirim true jika tabel penampung nilai elemen stack penuh */
    
    /*********** Menambahkan sebuah elemen ke Stack **********/
    void Push(Stack *S, infotype X){
		if(IsFull(*S))
			printf("Sorry the stack is already full");
		else {
			S->TOP = S->TOP + 1;
			S->T[S->TOP] = X;
		}
	}
    /* Menambahkan X sebagai elemen Stack S. */
    /* I.S. S mungkin kosong, tabel penampung elemen stack TIDAK penuh */
    /* F.S. X menjadi TOP yang baru,TOP bertambah 1 */
    
    /*********** Menghapus sebuah elemen Stack **********/
    void Pop(Stack *S, infotype *X);
    /* Menghapus X dari Stack S. */
    /* I.S. S tidak mungkin kosong */
    /* F.S. X adalah nilai elemen TOP yang lama, TOP berkurang 1 */

#ifdef	__cplusplus
}
#endif

#endif	/* STACKD_H */

