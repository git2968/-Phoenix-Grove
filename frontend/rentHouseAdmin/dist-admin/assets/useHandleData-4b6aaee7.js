import{E as u,z as a}from"./index-5dfd6cdf.js";const l=(s,r,t,n="warning")=>new Promise((c,o)=>{u.confirm(`是否${t}?`,"温馨提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:n,draggable:!0}).then(async()=>{if(!await s(r))return o(!1);a({type:"success",message:`${t}成功!`}),c(!0)}).catch(e=>{e!=="cancel"&&a({type:"error",message:`${e.data}`})})});export{l as u};
