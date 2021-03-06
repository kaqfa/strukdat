/* 
 * File:   stack.h
 * Author: kaqfa
 *
 * Created on October 11, 2012, 3:08 PM
 */

#ifndef STACK_H
#define	STACK_H

#ifdef	__cplusplus
extern "C" {
#endif

    /* File : stackt.h */
    /* Deklarasi stack yang diimplementasi dengan tabel kontigu */
    /* dan ukuran sama */
    /* TOP adalah alamat elemen puncak */

    /* Implementasi Stack dalam bahasa C dengan alokasi statik */

#include "boolean.h"
#include <stdio.h>
#define Nil 0
#define MaxEl 10   
    /* Nil adalah stack dengan elemen kosong */
    /* Karena indeks dalam bhs C dimulai 0 maka tabel dg indeks 0 tidak */
    /* dipakai */

    typedef int infotype;
    typedef int address;

    /* indeks tabel */
    /* Contoh deklarasi variabel bertype stack dengan ciri TOP : */

    /* Versi I : dengan menyimpan tabel dan alamat top secara eksplisit*/
    typedef struct {
        infotype T[MaxEl + 1]; /* tabel penyimpan elemen */
        address TOP; /* alamat TOP: elemen puncak */
    } Stack;

    /* Definisi stack S kosong : S.TOP = Nil */
    /* Elemen yang dipakai menyimpan nilai Stack T[1]..T[MaxEl] */
    /* Jika S adalah Stack maka akses elemen : */
    /* S.T[(S.TOP)] untuk mengakses elemen TOP */
    /* S.TOP adalah alamat elemen TOP */
    /* Definisi akses dengan Selektor : Set dan Get */
#define Top(S) (S).TOP
#define InfoTop(S) (S).T[(S).TOP]
    /*** Perubahan nilai komponen struktur ***/
    /*** Untuk bahasa C tidak perlu direalisasi ***/

    /********** Prototype **********/
    /*** Konstruktor/Kreator ***/
    void CreateEmpty(Stack *S){
		S->TOP = 0;		
	}
    /* I.S. Sembarang */
    /* F.S. Membuat sebuah stack S yang kosong berkapasitas MaxEl */
    /* jadi indeksnya antara 1.. MaxEl+1 karena 0 tidak dipakai */
    /* Ciri stack kosong : TOP bernilai Nil */
    /********** Predikat Untuk test keadaan KOLEKSI **********/

    boolean IsEmpty(Stack S){
		if(Top(S) == 0)
			return benar;
		else
			return salah;
	}
    /* Mengirim true jika Stack kosong: lihat definisi di atas */

    boolean IsFull(Stack S){
		if(Top(S) == 10)
			return benar;
		else
			return salah;
	}
    /* Mengirim true jika tabel penampung nilai elemen stack penuh */
    /*********** Menambahkan sebuah elemen ke Stack **********/

    void Push(Stack *S, infotype X){
		if(IsFull(*S)){
			printf("Maaf Tumpukan Sudah Penuh");
		} else {
			S->TOP = S->TOP + 1;
			S->T[S->TOP] = X;
		}
	}
    /* Menambahkan X sebagai elemen Stack S. */
    /* I.S. S mungkin kosong, tabel penampung elemen stack TIDAK penuh */
    /* F.S. X menjadi TOP yang baru,TOP bertambah 1 */
    
    /*********** Menghapus sebuah elemen Stack **********/
    void Pop(Stack *S, int count){ // infotype *X
		int i;
		for(i = 0; i < count; i++){
			if(IsEmpty(*S)){
				printf("Tumpukan Sudah Kosong");
			} else {
				printf("%d\n",S->T[S->TOP]);
				S->TOP = S->TOP - 1;
			}
		}
	}
    /* Menghapus X dari Stack S. */
    /* I.S. S tidak mungkin kosong */
    /* F.S. X adalah nilai elemen TOP yang lama, TOP berkurang 1 */


#ifdef	__cplusplus
}
#endif

#endif	/* STACK_H */

