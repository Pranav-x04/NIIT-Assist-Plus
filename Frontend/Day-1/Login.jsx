import React from 'react';
import '../assets/css/log.css';
import { Link } from 'react-router-dom';

function Login() {
    return (
        <div className='Login'>
        <div className="sign-in-container">
            <div className="sign-column s1">
                <div className="sign-column-face s2">
                    <div className="s3">
                        <div className="sign-header-section">
                            <div className="sign-in-title">
                                Login
                            </div>
                        </div>
                        <div className="sign-buttons">
                            <a href="#" className="login-w-button">
                                <img width="18" height="18" src="https://img.icons8.com/color/48/google-logo.png" alt="google-logo" />
                                <span>Sign in with Google</span>
                            </a>
                            <a href="#" className="login-w-button">
                                <img width="18" height="18" src="https://img.icons8.com/ios-filled/50/mac-os.png" alt="mac-os" />
                                <span>Sign in with Apple</span>
                            </a>
                        </div>
                        <div className="slice-container">
                            <div className="slice-text-c">
                                <div className="slicer"></div>
                                <div className="slice-text">Or with email</div>
                            </div>
                        </div>
                        <form className="input-container">
                            <input type="email" required placeholder="Email" />
                            <input type="password" required placeholder="Password" />
                            <a href="#" className="alt-f">
                                Forgot Password ?
                            </a>
                            <button>
                                Login
                            </button>
                            <div href="#" className="alt-f-full">
                                Not a Member yet ?
                                <Link to="/sign">Sign up</Link>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <div className="sign-column w2">
            </div>
        </div>
        </div>
    );
}

export default Login;
