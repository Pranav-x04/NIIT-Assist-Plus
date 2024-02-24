import { Link } from 'react-router-dom'
import '../assets/css/home.css'
import Footer from './footer'
function Homepage() {


  return (
    <>
    {/* Disclaimer: This pen is just a fun project based on a fictional character for freeCodeCamp and not in any form associated with the movie Her and Warner Bros. */}
    <header id="header" className="menu-container">
      {/*   Logo */}
      <div className="logo-box">
        <svg
          id="header-img"
          xmlns="http://www.w3.org/2000/svg"
          xmlnsXlink="http://www.w3.org/1999/xlink"
          version="1.1"
          x="0px"
          y="0px"
          viewBox="0 0 477.867 477.867"
          style={{ enableBackground: "new 0 0 477.867 477.867" }}
          xmlSpace="preserve">
            <g>
              <g>
                
            </g>
          </g>{" "}
        </svg>
      </div>
      {/*   Logo */}
      {/*   navbar */}
      <nav id="nav-bar">
        <input className="menu-btn" type="checkbox" id="menu-btn" />
        <label className="menu-icon" htmlFor="menu-btn">
          <span className="nav-icon" />
        </label>
        <ul className="menu">
          <li>
            <a href="#about" className="nav-link">
              About
            </a>
          </li>
          <li>
            <a href="#features" className="nav-link">
              Features
            </a>
          </li>
          <li>
            <a href="#">Solutions</a>
          </li>
          <Link to='/Log' className="highlight" href="#" >
            Login / Sign Up
            </Link>
        </ul>
      </nav>
      {/*   navbar */}
    </header>
    {/* header ends */}
    <main className="container">
      <section className="hero container">
        <h1 className="hero-title-primary">NPR</h1>
        <p className="hero-title-sub">
        Explore expert-led courses tailored to your interests. Join a dynamic learning community and elevate your skills today! Unleash your potential with our diverse course catalog.  </p>
        <button id='btnhome'>Unlock a trial period on us.</button>
      </section>
      <div className="hero-image">
       
      </div>
    </main>
    <div>
      <svg
        className="waves"
        xmlns="http://www.w3.org/2000/svg"
        xmlnsXlink="http://www.w3.org/1999/xlink"
        viewBox="0 24 150 28"
        preserveAspectRatio="none"
        shapeRendering="auto"
      >
        <defs>
          <path
            id="gentle-wave"
            d="M-160 44c30 0 58-18 88-18s 58 18 88 18 58-18 88-18 58 18 88 18 v44h-352z"
          />
        </defs>
        <g className="parallax">
          <use
            xlinkHref="#gentle-wave"
            x={48}
            y={0}
            fill="rgba(255,255,255,0.7"
          />
          <use
            xlinkHref="#gentle-wave"
            x={48}
            y={3}
            fill="rgba(255,255,255,0.5)"
          />
          <use
            xlinkHref="#gentle-wave"
            x={48}
            y={5}
            fill="rgba(255,255,255,0.3)"
          />
          <use xlinkHref="#gentle-wave" x={48} y={7} fill="#fff" />
        </g>
      </svg>
    </div>
    {/*Waves end*/}
    {/*Header ends*/}
    {/*Content starts*/}
   
    <section className="content">
      <div className="inner-content">
        <div className="inner-content-text content__TextLeft">
          <div id="about" className="inter-content-subtitle">
            About
          </div>
          <div className="inner-content-title">
Start exploring today and take the first step towards mastering new skills!
          </div>
          <div className="inner-content-para">
            <p>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vel
              lacinia ex. Pellentesque et augue interdum, efficitur neque a,
              convallis odio. Aenean pellentesque nunc mattis nunc tincidunt
              fermentum vitae quis quam. Duis scelerisque lectus quis tellus
              volutpat, a volutpat est placerat. Aliquam cursus quam at aliquet
              vestibulum. Mauris pellentesque lorem eget facilisis porttitor.
              Etiam ac gravida nibh, at vestibulum libero.
            </p>
          </div>
        </div>
        <div className="inner-image-container container__ImageRight">
          <div className="inner-content-image content__ImageRight">
            <img
              className="section-images"
              src="https://images.pexels.com/photos/4769464/pexels-photo-4769464.jpeg?auto=compress&cs=tinysrgb&w=800"
              style={{ objectPosition: "50% 50%" }}
            />
          </div>
        </div>
      </div>
      <div className="inner-content">
        <div className="inner-content-text content__TextRight">
          <div id="features" className="inter-content-subtitle">
            Features
          </div>
          <div className="inner-content-title">
            Built with Thousands of in-built tasks for you to choose from
          </div>
          <div className="inner-content-para">
            <p>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vel
              lacinia ex. Pellentesque et augue interdum, efficitur neque a,
              convallis odio. Aenean pellentesque nunc mattis nunc tincidunt
              fermentum vitae quis quam. Duis scelerisque lectus quis tellus
              volutpat, a volutpat est placerat. Aliquam cursus quam at aliquet
              vestibulum. Mauris pellentesque lorem eget facilisis porttitor.
              Etiam ac gravida nibh, at vestibulum libero.
            </p>
          </div>
        </div>
        <div className="inner-image-container container__ImageLeft">
          <div className="inner-content-image content__ImageLeft">
            <img
              className="section-images"
              src="https://images.pexels.com/photos/433333/pexels-photo-433333.jpeg?auto=compress&cs=tinysrgb&w=800"
              style={{ objectPosition: "50% 50%" }}
            />
          </div>
        </div>
      </div>
    </section>
    <section className="subscribe-container">
      <div className="hero-newsletter">
        <h2>Subscribe To Our Newsletter</h2>
      </div>
      <div className="form-container">
        <form
          id="form"
          action="#"
          method="post"
        >
          <input
            type="email"
            placeholder="Email Address"
            name="email"
            id="email"
            required=""
          />
          <div>
            <input type="submit" id="submit" defaultValue="Subscribe" />
          </div>
        </form>
      </div>
    </section>
    <Footer/>
  </>
  
  )
}

export default Homepage
