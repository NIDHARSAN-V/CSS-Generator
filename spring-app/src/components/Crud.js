import React from 'react'
import styled from "styled-components"

const Outer = styled.div`

width: 100%;

`



const HeadCont  = styled.div`
width: 100%;
background-image:linear-gradient(blue , red);
max-width: 100%;
display: flex;
align-items: center;
justify-content: center;
min-height: 10vh;
flex-wrap: wrap;
border-bottom: 10px groove blue;
color: Black;
text-shadow: 3px 3px 3px white;
font-weight: 900;
position: absolute;
`
function Crud() {
  return (
    <Outer>
    <HeadCont>
           <h1>Crud</h1>
    </HeadCont>
     
    </Outer>
  )
}

export default Crud
