import{d as k,r as F,_ as x,a as d,o as _,c as w,b as I,e as l,t as P,u as M,f as z,g as B,w as J,n as ee,h as v,i as r,T as te,j as b,k as U,l as h,m as N,p as H,q as Y,s as ne,v as oe,x as q,y as se,E as ae,L as ie,z as le,A as re,F as O,B as K,C as ce,I as ue,D as de,G as _e,H as W,J as fe,K as pe,M as me,N as he,O as ve,P as ge,Q as be,R as we}from"./index-5dfd6cdf.js";import{g as $e}from"./getEnv-8e61a39d.js";import{l as Q}from"./logo-1814c2c6.js";const ye=k({setup(){return{fullYear:F(new Date().getFullYear())}}});const Ve={class:"layout-footer-container"};function Ce(t,e,n,o,a,u){const s=d("svg-icon");return _(),w("div",Ve,[I(" Copyright "),l(s,{name:"copyright",size:"16px",color:"rgba(0, 0, 0, 0.45)"}),I(" "+P(t.fullYear)+"尚硅谷教学 ",1)])}const Ae=x(ye,[["render",Ce],["__scopeId","data-v-5283180e"]]),ke=k({setup(){const t=M(),e=F(!0),n=z(),o=B(()=>n.path+Math.random());return J(()=>t.refresh,()=>{e.value=!1,ee(()=>{e.value=!0})}),{isShow:e,key:o}}});const xe={class:"app-mian-height"};function Te(t,e,n,o,a,u){const s=d("router-view");return _(),w("section",xe,[t.isShow?(_(),v(s,{key:t.key},{default:r(({Component:i,route:c})=>[l(te,{appear:"",name:"fade-transform",mode:"out-in"},{default:r(()=>[(_(),v(b(i),{key:c.path}))]),_:2},1024)]),_:1})):U("",!0)])}const Be=x(ke,[["render",Te],["__scopeId","data-v-47b0c8c7"]]),Se=k({methods:{getEnvByName:$e},setup(){const t=M(),e=B(()=>t.collapse);return{logoPng:F(Q),collapse:e}}});const Le={class:"logo-container flex-center"},De={href:"/"},Fe=["src"],Ie={key:0,class:"title"};function Me(t,e,n,o,a,u){return _(),w("div",Le,[h("a",De,[h("img",{class:"logo",alt:"logo",src:t.logoPng},null,8,Fe),t.collapse?U("",!0):(_(),w("h1",Ie,P(t.getEnvByName("VITE_APP_TITLE")),1))])])}const Ee=x(Se,[["render",Me],["__scopeId","data-v-db95050c"]]),Pe=k({components:{Logo:Ee},setup(){const t=M(),e=z(),n=B(()=>t.collapse),o=B(()=>t.themeConfig),a=B(()=>e.meta.activeMenu?e.meta.activeMenu:e.path);return{collapse:n,activeMenu:a,themeConfig:o}}});const T=t=>(H("data-v-9c86acbd"),t=t(),Y(),t),Re=T(()=>h("span",null,"首页",-1)),ze=T(()=>h("span",null,"系统管理",-1)),Ue=T(()=>h("span",null,"用户管理",-1)),Ne=T(()=>h("span",null,"岗位管理",-1)),Oe=T(()=>h("span",null,"公寓管理",-1)),He=T(()=>h("span",null,"公寓管理",-1)),Ye=T(()=>h("span",null,"房间管理",-1)),qe=T(()=>h("span",null,"属性管理",-1)),Ge=T(()=>h("span",null,"租赁管理",-1)),We=T(()=>h("span",null,"看房预约管理",-1)),je=T(()=>h("span",null,"租约管理",-1)),Je=T(()=>h("span",null,"用户管理",-1));function Ke(t,e,n,o,a,u){const s=d("Logo"),i=d("el-icon"),c=d("el-menu-item"),p=d("el-sub-menu"),m=d("el-menu"),f=d("el-scrollbar");return _(),w("div",{class:N(["layout-sidebar-container",{"is-collapse":t.collapse}])},[l(s),l(f,null,{default:r(()=>[l(m,{"background-color":"#001529","text-color":"hsla(0,0%,100%,.65)","active-text-color":"#fff",defaultActive:t.activeMenu,collapse:t.collapse,"unique-opened":!0,router:""},{default:r(()=>[l(c,{index:"/index"},{title:r(()=>[Re]),default:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("HomeFilled")))]),_:1})]),_:1}),l(p,{index:"1"},{title:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("Setting")))]),_:1}),ze]),default:r(()=>[l(c,{index:"/system/user"},{title:r(()=>[Ue]),default:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("UserFilled")))]),_:1})]),_:1}),l(c,{index:"/system/post"},{title:r(()=>[Ne]),default:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("Postcard")))]),_:1})]),_:1})]),_:1}),l(p,{index:"2"},{title:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("OfficeBuilding")))]),_:1}),Oe]),default:r(()=>[l(c,{index:"/apartmentManagement/apartmentManagement/apartmentManagement"},{title:r(()=>[He]),default:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("OfficeBuilding")))]),_:1})]),_:1}),l(c,{index:"/apartmentManagement/roomManagement/roomManagement"},{title:r(()=>[Ye]),default:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("House")))]),_:1})]),_:1}),l(c,{index:"/apartmentManagement/attributeManagement/attributeManagement"},{title:r(()=>[qe]),default:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("List")))]),_:1})]),_:1})]),_:1}),l(p,{index:"3"},{title:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("Management")))]),_:1}),Ge]),default:r(()=>[l(c,{index:"/rentManagement/appointment/appointment"},{title:r(()=>[We]),default:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("Clock")))]),_:1})]),_:1}),l(c,{index:"/agreementManagement/agreement/agreement"},{title:r(()=>[je]),default:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("Document")))]),_:1})]),_:1})]),_:1}),l(c,{index:"/userManagement/userManagement"},{default:r(()=>[l(i,null,{default:r(()=>[(_(),v(b("User")))]),_:1}),Je]),_:1})]),_:1},8,["defaultActive","collapse"])]),_:1})],2)}const Qe=x(Pe,[["render",Ke],["__scopeId","data-v-9c86acbd"]]),Xe=k({components:{ArrowUp:ne,ArrowDown:oe},setup(){const t=F(Q),e=q(),n=z(),o=se(),{name:a,avatarUrl:u}=o.userInfo||{},s=F(!1);function i(m){s.value=m}function c(m){m==="logout"&&p()}function p(){ae.confirm("您确定要退出吗？","提示",{confirmButtonText:"确认",cancelButtonText:"取消",type:"warning"}).then(async()=>{await o.Logout(),e.push({path:ie,query:{redirect:n.fullPath}}),le.success("退出登录成功！")})}return{logoPng:t,name:a,avatarUrl:u,visible:s,onChange:i,handleCommand:c}}});const Ze=t=>(H("data-v-ad2f300d"),t=t(),Y(),t),et={class:"avatar-dropdown"},tt=["src"],nt={class:"user-name"},ot=Ze(()=>h("span",null,"退出登陆",-1));function st(t,e,n,o,a,u){const s=d("el-icon"),i=d("svg-icon"),c=d("el-dropdown-item"),p=d("el-dropdown-menu"),m=d("el-dropdown");return _(),v(m,{onVisibleChange:t.onChange,onCommand:t.handleCommand},{dropdown:r(()=>[l(p,null,{default:r(()=>[l(c,{command:"logout"},{default:r(()=>[l(i,{name:"logout",size:"16px"}),ot]),_:1})]),_:1})]),default:r(()=>[h("div",et,[h("img",{class:"user-avatar",src:t.avatarUrl||t.logoPng,alt:""},null,8,tt),h("div",nt,P(t.name),1),l(s,{class:"up-down"},{default:r(()=>[(_(),v(b(t.visible?"ArrowUp":"ArrowDown")))]),_:1})])]),_:1},8,["onVisibleChange","onCommand"])}const at=x(Xe,[["render",st],["__scopeId","data-v-ad2f300d"]]),it=k({setup(){const t=z(),e=q(),n=a=>{e.push({path:a.path})},o=B(()=>t.matched.filter(a=>a.meta&&a.meta.title&&a.meta.breadcrumb!==!1&&a.children.length!==1));return{handleLink:n,matched:o}}});const lt={key:0,class:"no-redirect"},rt=["onClick"];function ct(t,e,n,o,a,u){const s=d("el-icon"),i=d("el-breadcrumb-item"),c=d("el-breadcrumb");return _(),v(c,{class:"app-breadcrumb","separator-icon":"ArrowRight"},{default:r(()=>[l(re,{name:"breadcrumb"},{default:r(()=>[(_(!0),w(O,null,K(t.matched,(p,m)=>(_(),v(i,{key:p.path},{default:r(()=>{var f,$;return[l(s,{size:"14"},{default:r(()=>{var S;return[(_(),v(b((S=p.meta)==null?void 0:S.icon)))]}),_:2},1024),p.redirect==="noRedirect"||m==t.matched.length-1?(_(),w("span",lt,P((f=p.meta)==null?void 0:f.title),1)):(_(),w("a",{key:1,onClick:ce(S=>t.handleLink(p),["prevent"])},P(($=p.meta)==null?void 0:$.title),9,rt))]}),_:2},1024))),128))]),_:1})]),_:1})}const ut=x(it,[["render",ct],["__scopeId","data-v-ace3b9ab"]]),dt=k({components:{IconifyIcon:ue},setup(){const t=M();return{onRefresh:()=>{t.setRefresh()}}}});const _t={class:"btn"};function ft(t,e,n,o,a,u){const s=d("IconifyIcon"),i=d("el-button"),c=d("el-tooltip");return _(),w("div",_t,[l(c,{content:"刷新"},{default:r(()=>[l(i,{circle:"",onClick:t.onRefresh},{default:r(()=>[l(s,{icon:"ri:refresh-line",height:"16"})]),_:1},8,["onClick"])]),_:1})])}const pt=x(dt,[["render",ft],["__scopeId","data-v-70502d94"]]),mt=k({setup(){const{toggle:t,isFullscreen:e}=de();return{toggle:t,isFullscreen:e}}});const ht={class:"m-screenful"};function vt(t,e,n,o,a,u){const s=d("IconifyIcon"),i=d("el-button"),c=d("el-tooltip");return _(),w("div",ht,[l(c,{effect:"dark",content:t.isFullscreen?"收起":"全屏",placement:"bottom"},{default:r(()=>[l(i,{circle:"",onClick:t.toggle},{default:r(()=>[t.isFullscreen?(_(),v(s,{key:1,icon:"fluent:full-screen-minimize-24-filled",height:"18"})):(_(),v(s,{key:0,icon:"fluent:full-screen-maximize-24-filled",height:"16"}))]),_:1},8,["onClick"])]),_:1},8,["content"])])}const gt=x(mt,[["render",vt],["__scopeId","data-v-c59a4b3c"]]);function bt(t){return{all:t=t||new Map,on:function(e,n){var o=t.get(e);o?o.push(n):t.set(e,[n])},off:function(e,n){var o=t.get(e);o&&(n?o.splice(o.indexOf(n)>>>0,1):t.set(e,[]))},emit:function(e,n){var o=t.get(e);o&&o.slice().map(function(a){a(n)}),(o=t.get("*"))&&o.slice().map(function(a){a(e,n)})}}}const wt=bt(),X=wt,$t=k({setup(){return{onSetting:()=>{X.emit("openThemeDrawer")}}}});const yt={class:"btn"};function Vt(t,e,n,o,a,u){const s=d("IconifyIcon"),i=d("el-button"),c=d("el-tooltip");return _(),w("div",yt,[l(c,{effect:"dark",content:"系统设置"},{default:r(()=>[l(i,{circle:"",onClick:t.onSetting},{default:r(()=>[l(s,{icon:"ep:setting",height:"16"})]),_:1},8,["onClick"])]),_:1})])}const Ct=x($t,[["render",Vt],["__scopeId","data-v-2f3e76ea"]]),At=k({components:{Refresh:pt,User:at,ScreenFull:gt,Breadcrumb:ut,Settings:Ct},setup(){const t=M(),e=B(()=>t.collapse);function n(){t.changeCollapse()}return{collapse:e,handleCollapse:n}}});const kt={class:"nav-bar-container"},xt={class:"left-panel"},Tt={class:"right-panel"};function Bt(t,e,n,o,a,u){const s=d("el-icon"),i=d("Breadcrumb"),c=d("el-col"),p=d("Refresh"),m=d("ScreenFull"),f=d("Settings"),$=d("User"),S=d("el-row");return _(),w("div",kt,[l(S,{gutter:15},{default:r(()=>[l(c,{sm:12,md:12,lg:12,xl:12},{default:r(()=>[h("div",xt,[l(s,{class:"fold-unfold",onClick:t.handleCollapse},{default:r(()=>[(_(),v(b(t.collapse?"Expand":"Fold")))]),_:1},8,["onClick"]),l(i)])]),_:1}),l(c,{sm:12,md:12,lg:12,xl:12},{default:r(()=>[h("div",Tt,[l(p),l(m),l(f),l($)])]),_:1})]),_:1})])}const St=x(At,[["render",Bt],["__scopeId","data-v-ecc4c53a"]]),Lt=_e({id:"app-tabsBar",state:()=>({activeTabsValue:"/index",visitedViews:[],cachedViews:[]}),getters:{},actions:{setTabsMenuValue(t){this.activeTabsValue=t},addView(t){this.addVisitedView(t)},removeView(t){return new Promise(e=>{this.visitedViews=this.visitedViews.filter(n=>!t.includes(n.path)),e(null)})},addVisitedView(t){this.setTabsMenuValue(t.path),!(this.visitedViews.some(e=>e.path===t.path)||!t.meta)&&(this.visitedViews.push(Object.assign({},t,{title:t.meta.title||"no-name"})),t.meta.keepAlive&&t.name&&this.cachedViews.push(t.name))},delView(t){return new Promise(e=>{this.delVisitedView(t),this.delCachedView(t),e({visitedViews:[...this.visitedViews],cachedViews:[...this.cachedViews]})})},toLastView(t){const e=this.visitedViews.findIndex(o=>o.path===t),n=this.visitedViews[e+1]||this.visitedViews[e-1];n&&(W.push(n.path),this.addVisitedView(n))},delVisitedView(t){return new Promise(e=>{this.visitedViews=this.visitedViews.filter(n=>{if(n.meta)return n.path!==t||n.meta.affix}),this.cachedViews=this.cachedViews.filter(n=>n.path!==t||n.meta.affix),e([...this.visitedViews])})},delCachedView(t){return new Promise(e=>{const n=this.cachedViews.indexOf(t.name);n>-1&&this.cachedViews.splice(n,1),e([...this.cachedViews])})},clearVisitedView(){this.delAllViews()},delAllViews(){this.visitedViews=this.visitedViews.filter(t=>t.meta&&t.meta.affix),this.cachedViews=this.visitedViews.filter(t=>t.meta&&t.meta.affix)},delOtherViews(t){this.visitedViews=this.visitedViews.filter(e=>e.path===t||e.meta&&e.meta.affix),this.cachedViews=this.visitedViews.filter(e=>e.path===t||e.meta&&e.meta.affix)},goHome(){this.activeTabsValue="/index",W.push({path:"/index"})},updateVisitedView(t){for(let e of this.visitedViews)if(e.path===t.path){e=Object.assign(e,t);break}}}});function L(t){if(typeof t!="string")throw new TypeError("Path must be a string. Received "+JSON.stringify(t))}function j(t,e){for(var n="",o=0,a=-1,u=0,s,i=0;i<=t.length;++i){if(i<t.length)s=t.charCodeAt(i);else{if(s===47)break;s=47}if(s===47){if(!(a===i-1||u===1))if(a!==i-1&&u===2){if(n.length<2||o!==2||n.charCodeAt(n.length-1)!==46||n.charCodeAt(n.length-2)!==46){if(n.length>2){var c=n.lastIndexOf("/");if(c!==n.length-1){c===-1?(n="",o=0):(n=n.slice(0,c),o=n.length-1-n.lastIndexOf("/")),a=i,u=0;continue}}else if(n.length===2||n.length===1){n="",o=0,a=i,u=0;continue}}e&&(n.length>0?n+="/..":n="..",o=2)}else n.length>0?n+="/"+t.slice(a+1,i):n=t.slice(a+1,i),o=i-a-1;a=i,u=0}else s===46&&u!==-1?++u:u=-1}return n}function Dt(t,e){var n=e.dir||e.root,o=e.base||(e.name||"")+(e.ext||"");return n?n===e.root?n+o:n+t+o:o}var E={resolve:function(){for(var e="",n=!1,o,a=arguments.length-1;a>=-1&&!n;a--){var u;a>=0?u=arguments[a]:(o===void 0&&(o=process.cwd()),u=o),L(u),u.length!==0&&(e=u+"/"+e,n=u.charCodeAt(0)===47)}return e=j(e,!n),n?e.length>0?"/"+e:"/":e.length>0?e:"."},normalize:function(e){if(L(e),e.length===0)return".";var n=e.charCodeAt(0)===47,o=e.charCodeAt(e.length-1)===47;return e=j(e,!n),e.length===0&&!n&&(e="."),e.length>0&&o&&(e+="/"),n?"/"+e:e},isAbsolute:function(e){return L(e),e.length>0&&e.charCodeAt(0)===47},join:function(){if(arguments.length===0)return".";for(var e,n=0;n<arguments.length;++n){var o=arguments[n];L(o),o.length>0&&(e===void 0?e=o:e+="/"+o)}return e===void 0?".":E.normalize(e)},relative:function(e,n){if(L(e),L(n),e===n||(e=E.resolve(e),n=E.resolve(n),e===n))return"";for(var o=1;o<e.length&&e.charCodeAt(o)===47;++o);for(var a=e.length,u=a-o,s=1;s<n.length&&n.charCodeAt(s)===47;++s);for(var i=n.length,c=i-s,p=u<c?u:c,m=-1,f=0;f<=p;++f){if(f===p){if(c>p){if(n.charCodeAt(s+f)===47)return n.slice(s+f+1);if(f===0)return n.slice(s+f)}else u>p&&(e.charCodeAt(o+f)===47?m=f:f===0&&(m=0));break}var $=e.charCodeAt(o+f),S=n.charCodeAt(s+f);if($!==S)break;$===47&&(m=f)}var D="";for(f=o+m+1;f<=a;++f)(f===a||e.charCodeAt(f)===47)&&(D.length===0?D+="..":D+="/..");return D.length>0?D+n.slice(s+m):(s+=m,n.charCodeAt(s)===47&&++s,n.slice(s))},_makeLong:function(e){return e},dirname:function(e){if(L(e),e.length===0)return".";for(var n=e.charCodeAt(0),o=n===47,a=-1,u=!0,s=e.length-1;s>=1;--s)if(n=e.charCodeAt(s),n===47){if(!u){a=s;break}}else u=!1;return a===-1?o?"/":".":o&&a===1?"//":e.slice(0,a)},basename:function(e,n){if(n!==void 0&&typeof n!="string")throw new TypeError('"ext" argument must be a string');L(e);var o=0,a=-1,u=!0,s;if(n!==void 0&&n.length>0&&n.length<=e.length){if(n.length===e.length&&n===e)return"";var i=n.length-1,c=-1;for(s=e.length-1;s>=0;--s){var p=e.charCodeAt(s);if(p===47){if(!u){o=s+1;break}}else c===-1&&(u=!1,c=s+1),i>=0&&(p===n.charCodeAt(i)?--i===-1&&(a=s):(i=-1,a=c))}return o===a?a=c:a===-1&&(a=e.length),e.slice(o,a)}else{for(s=e.length-1;s>=0;--s)if(e.charCodeAt(s)===47){if(!u){o=s+1;break}}else a===-1&&(u=!1,a=s+1);return a===-1?"":e.slice(o,a)}},extname:function(e){L(e);for(var n=-1,o=0,a=-1,u=!0,s=0,i=e.length-1;i>=0;--i){var c=e.charCodeAt(i);if(c===47){if(!u){o=i+1;break}continue}a===-1&&(u=!1,a=i+1),c===46?n===-1?n=i:s!==1&&(s=1):n!==-1&&(s=-1)}return n===-1||a===-1||s===0||s===1&&n===a-1&&n===o+1?"":e.slice(n,a)},format:function(e){if(e===null||typeof e!="object")throw new TypeError('The "pathObject" argument must be of type Object. Received type '+typeof e);return Dt("/",e)},parse:function(e){L(e);var n={root:"",dir:"",base:"",ext:"",name:""};if(e.length===0)return n;var o=e.charCodeAt(0),a=o===47,u;a?(n.root="/",u=1):u=0;for(var s=-1,i=0,c=-1,p=!0,m=e.length-1,f=0;m>=u;--m){if(o=e.charCodeAt(m),o===47){if(!p){i=m+1;break}continue}c===-1&&(p=!1,c=m+1),o===46?s===-1?s=m:f!==1&&(f=1):s!==-1&&(f=-1)}return s===-1||c===-1||f===0||f===1&&s===c-1&&s===i+1?c!==-1&&(i===0&&a?n.base=n.name=e.slice(1,c):n.base=n.name=e.slice(i,c)):(i===0&&a?(n.name=e.slice(1,s),n.base=e.slice(1,c)):(n.name=e.slice(i,s),n.base=e.slice(i,c)),n.ext=e.slice(s,c)),i>0?n.dir=e.slice(0,i-1):a&&(n.dir="/"),n},sep:"/",delimiter:":",win32:null,posix:null};E.posix=E;var Ft=E;const It=fe(Ft),Mt=k({setup(){const t=Lt(),e=me,n=B(()=>t.visitedViews),o=z(),a=q();let u=F([]);const s=()=>{const{name:g,path:C}=o;if(g!=="Login")return(g||C)&&t.addView(o),!1};function i(g,C="/"){let V=[];return g.forEach(A=>{if(A.meta&&A.meta.affix){const R=It.resolve(C,A.path);V.push({fullPath:R,path:R,name:A.name,meta:{...A.meta}})}if(A.children){const R=i(A.children,A.path);R.length>=1&&(V=[...V,...R])}}),V}const c=()=>{let g=e,C=u.value=i(g);for(const V of C)V.name&&t.addVisitedView(V)};pe(()=>{c(),s()}),J(o,()=>{s()});const p=B({get:()=>t.activeTabsValue,set:g=>{t.setTabsMenuValue(g)}});function m(g){let C=n.value.findIndex(A=>A.path===g);const V=n.value[C+1]||n.value[C-1];V&&(a.push(V.path),t.addVisitedView(V))}const f=g=>{let C=g.props.name;a.push(C)},$=g=>g===o.path;return{activeTabsValue:p,tabClick:f,removeTab:async g=>{$(g)&&m(g),await t.delView(g)},visitedViews:n,closeCurrentTab:()=>{t.toLastView(o.path),t.delView(o.path)},closeOtherTab:()=>{t.delOtherViews(o.path)},closeAllTab:async()=>{t.delAllViews(),t.goHome()}}}});const Et={class:"tabs-bar-container"},Pt={class:"tabs-content"},Rt={class:"tabs-action"};function zt(t,e,n,o,a,u){const s=d("el-icon"),i=d("el-tab-pane"),c=d("el-tabs"),p=d("Menu"),m=d("FolderRemove"),f=d("el-dropdown-item"),$=d("Close"),S=d("FolderDelete"),D=d("el-dropdown-menu"),G=d("el-dropdown");return _(),w("div",Et,[h("div",Pt,[l(c,{type:"card",modelValue:t.activeTabsValue,"onUpdate:modelValue":e[0]||(e[0]=y=>t.activeTabsValue=y),onTabClick:t.tabClick,onTabRemove:t.removeTab},{default:r(()=>[(_(!0),w(O,null,K(t.visitedViews,y=>{var g,C;return _(),w(O,{key:y.path},[((g=y.meta)==null?void 0:g.isHide)!==!0?(_(),v(i,{key:0,type:"card",path:y.path,label:y.title,name:y.path,closable:!(y.meta&&((C=y.meta)!=null&&C.affix))},{label:r(()=>{var V;return[y.meta&&((V=y.meta)!=null&&V.icon)?(_(),v(s,{key:0,size:"16",class:"tabs-icon"},{default:r(()=>{var A;return[(_(),v(b((A=y.meta)==null?void 0:A.icon)))]}),_:2},1024)):U("",!0),I(" "+P(y.title),1)]}),_:2},1032,["path","label","name","closable"])):U("",!0)],64)}),128))]),_:1},8,["modelValue","onTabClick","onTabRemove"])]),h("div",Rt,[l(G,{trigger:"hover"},{dropdown:r(()=>[l(D,null,{default:r(()=>[l(f,{onClick:t.closeCurrentTab},{default:r(()=>[l(s,{size:14},{default:r(()=>[l(m)]),_:1}),I(" 关闭当前 ")]),_:1},8,["onClick"]),l(f,{onClick:t.closeOtherTab},{default:r(()=>[l(s,{size:14},{default:r(()=>[l($)]),_:1}),I(" 关闭其他 ")]),_:1},8,["onClick"]),l(f,{onClick:t.closeAllTab},{default:r(()=>[l(s,{size:14},{default:r(()=>[l(S)]),_:1}),I(" 关闭所有 ")]),_:1},8,["onClick"])]),_:1})]),default:r(()=>[l(s,{color:"rgba(0, 0, 0, 0.65)",size:20},{default:r(()=>[l(p)]),_:1})]),_:1})])])}const Ut=x(Mt,[["render",zt],["__scopeId","data-v-d7876e24"]]),Z=t=>(H("data-v-ea3373c3"),t=t(),Y(),t),Nt={class:"theme-item"},Ot=Z(()=>h("span",null,"主题颜色",-1)),Ht={class:"theme-item"},Yt=Z(()=>h("span",null,"暗黑模式",-1)),qt=k({__name:"index",setup(t){const{changePrimary:e}=he(),n=[ge,"#DAA96E","#0C819F","#722ed1","#27ae60","#ff5c93","#e74c3c","#fd726d","#f39c12","#9b59b6"],o=M(),a=B(()=>o.themeConfig),u=F(!1);return X.on("openThemeDrawer",()=>{u.value=!0}),(s,i)=>{const c=d("el-divider"),p=d("el-color-picker"),m=d("SwitchDark"),f=d("el-drawer");return _(),v(f,{title:"主题设置",modelValue:u.value,"onUpdate:modelValue":i[1]||(i[1]=$=>u.value=$),size:"300px"},{default:r(()=>[l(c,{class:"divider","content-position":"center"},{default:r(()=>[I("全局主题")]),_:1}),h("div",Nt,[Ot,l(p,{modelValue:a.value.primary,"onUpdate:modelValue":i[0]||(i[0]=$=>a.value.primary=$),predefine:n,onChange:ve(e)},null,8,["modelValue","onChange"])]),h("div",Ht,[Yt,l(m)])]),_:1},8,["modelValue"])}}});const Gt=x(qt,[["__scopeId","data-v-ea3373c3"]]),Wt=k({components:{LayoutFooter:Ae,LayoutMain:Be,LayoutSideBar:Qe,LayoutNavBar:St,LayoutTabsBar:Ut,ThemeDrawer:Gt},setup(){const t=M(),e=B(()=>t.collapse),n=F(0),o=we(()=>{n.value=document.body.clientWidth,!e.value&&n.value<1200&&t.changeCollapse(),e.value&&n.value>1200&&t.changeCollapse()},100);return window.addEventListener("resize",o,!1),be(()=>{window.removeEventListener("resize",o)}),{collapse:e}}});const jt={class:"layout-admin-wrapper"},Jt={class:"layout-container-vertical fixed"},Kt={class:"app-main-container"};function Qt(t,e,n,o,a,u){const s=d("LayoutSideBar"),i=d("LayoutNavBar"),c=d("LayoutTabsBar"),p=d("LayoutMain"),m=d("LayoutFooter"),f=d("ThemeDrawer");return _(),w("div",jt,[h("div",Jt,[l(s),h("div",{class:N(["layout-main",{"is-collapse":t.collapse}])},[h("div",{class:N(["layout-header fixed-header",{"is-collapse":t.collapse}])},[l(i),l(c)],2),h("div",Kt,[l(p),l(m)])],2)]),l(f)])}const tn=x(Wt,[["render",Qt],["__scopeId","data-v-c0930d89"]]);export{tn as default};
