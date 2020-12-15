// コーディングを支える技術 p78
// 例外処理

class Exception{
    // shippaiはMyexceptionを投げる
    void shippai() throws MyException{
        throw new MyException();
    }

    // 方法1 shippaiを使うには throws MyException と宣言する
    void foo() throws MyException{
        shippai();
    }

    // 方法2 MyExcepitonをcatchしてエラー処理
    coid bar(){
        try{
            shippai();
        }catch(MyException e){

        }
    }
}

class MyException extend Exception{
    
}