import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styles.css';

function Navbar() {
    return (
        <header>
            <nav className='container'>
                <div className='taskmgnt-nav-content'>
                    <h1>Taskmgnt</h1>
                    <a href="https://github.com/marciorbarcellos/taskmgnt">
                        <div className='taskmgnt-contact-container'>
                            <GithubIcon />
                            <p className='taskmgnt-contact-link'>/Taskmgnt</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;