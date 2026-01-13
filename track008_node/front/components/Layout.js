// components/Layout.js
import Link from 'next/link';
 // 중괄호 없음 default export: 모듈당 1개,  중괄호 있음{} named export: 모듈당 여러개

 export default function Layout({ children}){ //##
    return(
        <div>
            {/*헤더*/}
            <div class="p-5 bg-primary text-white text-center">
  <h1>공용 레이아웃 헤더</h1> 
</div>
            {/*네비게이션*/}
            <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                    <div class="container-fluid">
                        <ul class="navbar-nav">
                            {/*홈링크*/}
                        <li class="nav-item">
                            <Link href ="/users">
                            <a class="nav-link active" href="#">Home</a>
                            </Link>
                        </li>
                        {/*로그인*/}
                        <li class="nav-item">
                            <Link href="/login">
                            <a class="nav-link" href="#">로그인</a>
                            </Link>
                        </li>
                        {/*회원가입*/}
                        <li class="nav-item">
                            <Link href="/join">
                            <a class="nav-link" href="#">회원가입</a>
                            </Link>
                        </li>
                        </ul>
                    </div>
            </nav>
            {/*본문*/}
            <main className="container mt-4">{children}</main>
            {/*푸터*/}
            <footer class="mt-5 p-4 bg-dark text-white text-center">
            <p>Footer</p>
            </footer>
        </div>
       
    );

 }
