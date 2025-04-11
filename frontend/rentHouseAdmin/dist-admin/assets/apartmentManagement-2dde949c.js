import{d as N,x as S,r as H,S as v,K as x,a as r,o as B,h as O,i as o,e as i,b as c,O as T,a1 as U,a0 as j}from"./index-5dfd6cdf.js";import{u as q}from"./useHandleData-4b6aaee7.js";import{g as $,u as K,a as z,d as G,b as J,c as Q}from"./index-5e3a9f2b.js";import{A as b}from"./constEnums-c94e3170.js";import"./index-6d5762d1.js";function u(s){return typeof s=="function"||Object.prototype.toString.call(s)==="[object Object]"&&!j(s)}const te=N({__name:"apartmentManagement",setup(s){const p=S(),l=H(),a=v({provinceList:[],provinceId:"",cityList:[],cityId:"",districtList:[],districtId:""}),f=[{prop:"provinceId",label:"省份",isShow:!1,fieldNames:{label:"name",value:"id"},search:{el:"select",render:()=>{let e;return i(r("el-select"),{modelValue:a.provinceId,"onUpdate:modelValue":t=>a.provinceId=t,placeholder:"请选择省份",clearable:!0,key:"provinceId",onChange:_,onClear:L},u(e=a.provinceList.map(t=>i(r("el-option"),{key:t.id,label:t.name,value:t.id},null)))?e:{default:()=>[e]})}}},{prop:"cityId",label:"城市",isShow:!1,fieldNames:{label:"name",value:"id"},search:{el:"select",key:"cityId",render:()=>{let e;return i(r("el-select"),{modelValue:a.cityId,"onUpdate:modelValue":t=>a.cityId=t,placeholder:"请选择城市",clearable:!0,key:"cityId",onChange:k,onClear:E},u(e=a.cityList.map(t=>i(r("el-option"),{key:t.id,label:t.name,value:t.id},null)))?e:{default:()=>[e]})}}},{prop:"districtId",label:"区域",isShow:!1,fieldNames:{label:"name",value:"id"},search:{el:"select",key:"districtId",render:()=>{let e;return i(r("el-select"),{modelValue:a.districtId,"onUpdate:modelValue":t=>a.districtId=t,placeholder:"请选择区域",clearable:!0,onChange:P,onClear:A},u(e=a.districtList.map(t=>i(r("el-option"),{key:t.id,label:t.name,value:t.id},null)))?e:{default:()=>[e]})}}},{prop:"name",label:"名称"},{prop:"addressDetail",label:"详细地址"},{prop:"freeRoomCount",label:"空闲房间数"},{prop:"totalRoomCount",label:"房间总数"},{prop:"provinceName",label:"所处省份"},{prop:"cityName",label:"所处城市"},{prop:"districtName",label:"所处区域"},{prop:"phone",label:"联系方式"},{prop:"入住状态",label:"入住状态",render:({row:e})=>e.freeRoomCount===0?i(r("el-tag"),{type:"info"},{default:()=>[c("已满房")]}):i(r("el-tag"),{type:"success"},{default:()=>[c("可入住")]})},{prop:"isRelease",label:"发布状态",render:({row:e})=>i(r("el-switch"),{"active-value":b.RELEASED,"inactive-value":b.NOT_RELEASED,modelValue:e.isRelease,"onUpdate:modelValue":t=>e.isRelease=t,onChange:()=>K(e.id,e.isRelease)},null)},{prop:"operation",label:"操作",fixed:"right",width:230}],h=v({});async function I(){var e;try{const{data:t}=await z();a.provinceList=t,(e=l.value)==null||e.enumMap.set("provinceId",a.provinceList)}catch(t){console.log(t)}}async function C(e){var t;try{const{data:n}=await J(e);a.cityList=n,(t=l.value)==null||t.enumMap.set("cityId",a.cityList)}catch(n){console.log(n)}}async function g(e){var t;try{const{data:n}=await Q(e);a.districtList=n,(t=l.value)==null||t.enumMap.set("districtId",a.districtList)}catch(n){console.log(n)}}function m(){var e;a.cityId="",a.cityList=[],(e=l.value)==null||e.enumMap.set("cityId",[]),l.value.searchParam.cityId=""}function d(){var e;a.districtId="",a.districtList=[],(e=l.value)==null||e.enumMap.set("districtId",[]),l.value.searchParam.districtId=""}const _=async()=>{let e=l.value.searchParam.provinceId;e&&(m(),d(),await C(e))},L=()=>{a.provinceId="",l.value.searchParam.provinceId="",m(),d()},k=async()=>{let e=l.value.searchParam.cityId;e&&(d(),await g(e))},E=()=>{console.log("清空城市"),a.cityId="",l.value.searchParam.cityId="",d()},P=async()=>{console.log("区域改变")},A=()=>{console.log("清空区域"),a.districtId="",l.value.searchParam.districtId=""},R=e=>({list:e==null?void 0:e.records,total:e==null?void 0:e.total}),D=e=>{console.log("跳转"),p.push({path:"/apartmentManagement/apartmentManagement/addOrEditApartment",query:{id:e.id}})},M=()=>{p.push({path:"/apartmentManagement/apartmentManagement/addOrEditApartment"})},V=async e=>{var t;await q(G,e.id,`删除${e.name}`),(t=l.value)==null||t.getTableList()};return x(()=>{I()}),(e,t)=>{const n=r("el-button"),w=r("el-card");return B(),O(w,null,{default:o(()=>[i(U,{ref_key:"proTable",ref:l,dataCallback:R,columns:f,requestApi:T($),initParam:h,stripe:!0},{tableHeader:o(()=>[i(n,{type:"primary",icon:"Plus",onClick:M},{default:o(()=>[c(" 新增公寓 ")]),_:1})]),operation:o(y=>[i(n,{type:"success",icon:"Edit",onClick:F=>D(y.row)},{default:o(()=>[c(" 修改 ")]),_:2},1032,["onClick"]),i(n,{type:"danger",icon:"Delete",onClick:F=>V(y.row)},{default:o(()=>[c(" 删除 ")]),_:2},1032,["onClick"])]),_:1},8,["requestApi","initParam"])]),_:1})}}});export{te as default};
