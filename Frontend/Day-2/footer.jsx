import React from 'react';

function Footer() {
  return (
    <footer style={{ backgroundColor: "#27374D", padding: "20px", textAlign: "center" }}>
      <div style={{ display: "flex", justifyContent: "center", alignItems: "center" }}>
        <div style={{ marginRight: "10px" }}>
          <svg
            xmlns="http://www.w3.org/2000/svg"
            xmlnsXlink="http://www.w3.org/1999/xlink"
            version="1.1"
            x="0px"
            y="0px"
            width="40px"
            height="40px"
            viewBox="0 0 477.867 477.867"
            style={{ enableBackground: "new 0 0 477.867 477.867" }}
            xmlSpace="preserve"
          >
            <g>
              <g>
                <g>
                 
                </g>
              </g>
            </g>{" "}
          </svg>
        </div>
        <div style={{ display: "flex", flexDirection: "column", justifyContent: "center" }}>
          <a href="#about" style={{ margin: "0 15px", textDecoration: "none", color: "#ffffff",padding:"10px",justifyContent:"center" }}>About</a>
          <a href="#features" style={{ margin: "0 15px", textDecoration: "none", color: "#ffffff",padding:"10px",justifyContent:"center" }}>Features</a>
          <a href="#" style={{ margin: "0 15px", textDecoration: "none", color: "#ffffff",padding:"10px",justifyContent:"center" }}>Solutions</a>
        </div>
      </div>
      <div style={{ marginTop: "18px" }}>
        <p style={{ margin: "0", fontSize: "12px", color: "#ffffff",justifyContent:"center" }}>© 2024 NPR. All Rights Reserved.</p>
      </div>
    </footer>
  );
}

export default Footer;
