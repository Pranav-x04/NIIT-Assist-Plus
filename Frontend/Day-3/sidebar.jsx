import React from 'react';
import './sidebar.css';
import {Link} from 'react-router-dom';
import { Route } from 'react-router-dom';
const Sidebar = () => {
  return (
    <div>
      {/* Link to include Material Icons font */}
      <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />

      {/* Sidebar */}
      <div id="mySidebar" className="sidebar">
        
        <br />
        <a href="#">
          <i className="material-icons">logo</i>
          <Link to = '/ProfilePage'>Profile</Link>
        </a><br />
   
        <a href="#">
          
         <Link to = '/contact'><span className="icon-text"><i className="material-icons">email</i>contact</span></Link> 
        </a>
        <a href="#">
          
         <Link to = '/'><span className="icon-text"><i className="material-icons">logout</i>Logout</span></Link> 
        </a>
      </div>

      {/* Main content */}
      <div id="main">
        <h2>COURSE DETAILS</h2>
        <div className="container">
            <header>
                
                <div className="jumbotron py-4 rounded-0">
                    
                    
                </div>
            </header>
            <div className="card-deck">
                 
                
                {/* Repeat the above card structure for other cards */}
            </div>
            <div className="card-deck">
                <div className="card my-3">
                    <div className='box'>
                      <div className='box1'>
                      <h4 className="card-title"></h4>
                      <Link to = '/contact'> <button className="btn btn-primary" type="button">Enquire</button></Link>
                      <Link to = '/payment'> <button className="btn btn-primary" type="button">Start</button></Link>
                      </div>
                      <div className='box2'>
                      <h4 className="card-title"></h4>
                      <Link to = '/contact'> <button className="btn btn-primary" type="button">Enquire</button></Link>
                      <Link to = '/payment'> <button className="btn btn-primary" type="button">Start</button></Link>
                      </div>
                      <div className='box3'>
                      <h4 className="card-title"></h4>
                      <Link to = '/contact'> <button className="btn btn-primary" type="button">Enquire</button></Link>
                      <Link to = '/payment'> <button className="btn btn-primary" type="button">Start</button></Link>
                      </div>
                    </div>
                    <div className="card-body">
                        
                    </div>
                </div>
            </div>

            <div className="card-deck">
                <div className="card my-3">
                    <div className='box'>
                      <div className='box7'>
                      <h4 className="card-title"></h4>
                     <Link to = '/contact'> <button className="btn btn-primary" type="button">Enquire</button></Link>
                     <Link to = '/payment'> <button className="btn btn-primary" type="button">Start</button></Link>
                      </div>
                      <div className='box8'>
                      <h4 className="card-title"></h4>
                      <Link to = '/contact'> <button className="btn btn-primary" type="button">Enquire</button></Link>
                      <Link to = '/payment'> <button className="btn btn-primary" type="button">Start</button></Link>
                      </div>
                      <div className='box9'>
                      <h4 className="card-title"></h4>
                      <Link to = '/contact'> <button className="btn btn-primary" type="button">Enquire</button></Link>
                      <Link to = '/payment'> <button className="btn btn-primary" type="button">Start</button></Link>
                      </div>
                    </div>
                    <div className="card-body">
                        
                    </div>
                </div>
            </div>

            <div className="card-deck">
                <div className="card my-3">
                    <div className='box'>
                      <div className='box4'>
                      <h4 className="card-title"></h4>
                      <Link to = '/contact'> <button className="btn btn-primary" type="button">Enquire</button></Link>
                      <Link to = '/payment'> <button className="btn btn-primary" type="button">Start</button></Link>
                      </div>
                      <div className='box5'>
                      <h4 className="card-title"></h4>
                      <Link to = '/contact'> <button className="btn btn-primary" type="button">Enquire</button></Link>
                      <Link to = '/payment'> <button className="btn btn-primary" type="button">Start</button></Link>
                      </div>
                      <div className='box6'>
                      <h4 className="card-title"></h4>
                      <Link to = '/contact'> <button className="btn btn-primary" type="button">Enquire</button></Link>
                     
                      </div>
                    </div>
                    <div className="card-body">
                        
                    </div>
                </div>
            </div>
            
            
            

        </div>
      </div>
    </div>
  );
};

export default Sidebar;