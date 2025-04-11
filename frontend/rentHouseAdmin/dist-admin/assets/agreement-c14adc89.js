import{d as J,x as Q,r as X,S as w,K as Y,a as s,o as v,h,i as c,e as n,b as m,O as C,k,a1 as Z,a0 as ee}from"./index-5dfd6cdf.js";import{u as _}from"./useHandleData-4b6aaee7.js";import{a as te,b as ae,c as re,m as le}from"./index-5e3a9f2b.js";import{j as i,g as y,k as ne,l as f}from"./constEnums-c94e3170.js";import{a as se,d as oe,b as L}from"./index-34ef0583.js";import"./index-6d5762d1.js";function d(b){return typeof b=="function"||Object.prototype.toString.call(b)==="[object Object]"&&!ee(b)}const ye=J({__name:"agreement",setup(b){const E=Q(),r=X(),a=w({provinceList:[],provinceId:"",cityList:[],cityId:"",districtList:[],districtId:"",apartmentList:[],apartmentId:""}),D=[{prop:"name",label:"姓名",search:{el:"input",props:{placeholder:"请输入姓名"}}},{prop:"phone",label:"手机",search:{el:"input",props:{placeholder:"请输入手机号"}}},{prop:"roomNumber",label:"房间",search:{el:"input",props:{placeholder:"请输入房间号"}},render:({row:e})=>e.roomInfo.roomNumber},{prop:"provinceId",label:"省份",isShow:!1,fieldNames:{label:"name",value:"id"},search:{el:"select",render:()=>{let e;return n(s("el-select"),{modelValue:a.provinceId,"onUpdate:modelValue":t=>a.provinceId=t,placeholder:"请选择省份",clearable:!0,key:"provinceId",onChange:S,onClear:O},d(e=a.provinceList.map(t=>n(s("el-option"),{key:t.id,label:t.name,value:t.id},null)))?e:{default:()=>[e]})}}},{prop:"cityId",label:"城市",isShow:!1,fieldNames:{label:"name",value:"id"},search:{el:"select",key:"cityId",render:()=>{let e;return n(s("el-select"),{modelValue:a.cityId,"onUpdate:modelValue":t=>a.cityId=t,placeholder:"请选择城市",clearable:!0,key:"cityId",onChange:V,onClear:H},d(e=a.cityList.map(t=>n(s("el-option"),{key:t.id,label:t.name,value:t.id},null)))?e:{default:()=>[e]})}}},{prop:"districtId",label:"区域",isShow:!1,fieldNames:{label:"name",value:"id"},search:{el:"select",key:"districtId",render:()=>{let e;return n(s("el-select"),{modelValue:a.districtId,"onUpdate:modelValue":t=>a.districtId=t,placeholder:"请选择区域",clearable:!0,onChange:F,onClear:R},d(e=a.districtList.map(t=>n(s("el-option"),{key:t.id,label:t.name,value:t.id},null)))?e:{default:()=>[e]})}}},{prop:"apartmentId",label:"公寓",isShow:!1,fieldNames:{label:"name",value:"id"},search:{el:"select",key:"apartmentId",render:()=>{let e;return n(s("el-select"),{modelValue:a.apartmentId,"onUpdate:modelValue":t=>a.apartmentId=t,placeholder:"请选择公寓",clearable:!0,onChange:W,onClear:x},d(e=a.apartmentList.map(t=>n(s("el-option"),{key:t.id,label:t.name,value:t.id},null)))?e:{default:()=>[e]})}}},{prop:"apartmentInfo.name",label:"签约公寓"},{prop:"apartmentInfo.provinceName",label:"所处省份"},{prop:"apartmentInfo.cityName",label:"所处城市"},{prop:"apartmentInfo.districtName",label:"所处区域"},{prop:"leaseStartDate",label:"租约周期",width:200,render:({row:e})=>e.leaseStartDate+" ～ "+e.leaseEndDate},{prop:"rent",label:"租金（元/月）"},{prop:"deposit",label:"押金（元）"},{prop:"paymentType.name",label:"支付方式"},{prop:"leaseTerm.monthCount",label:"租期（月）"},{prop:"sourceType",label:"租约来源",render:({row:e})=>y(ne,e.sourceType)},{prop:"status",label:"租约状态",render:({row:e})=>{let t,l,I,o,u;switch(e.status){case i.WAITING:return n(s("el-tag"),{type:"warning"},d(t=y(f,e.status))?t:{default:()=>[t]});case i.RENEW_TO_BE_CONFIRMED:return n(s("el-tag"),{type:"warning"},d(l=y(f,e.status))?l:{default:()=>[l]});case i.SIGNED:return n(s("el-tag"),{type:"success"},d(I=y(f,e.status))?I:{default:()=>[I]});case i.TO_BE_CONFIRMED:return n(s("el-tag"),{type:"danger"},d(o=y(f,e.status))?o:{default:()=>[o]});default:return n(s("el-tag"),{type:"info"},d(u=y(f,e.status))?u:{default:()=>[u]})}}},{prop:"operation",label:"操作",fixed:"right",width:320}],T=w({});async function A(){var e;try{const{data:t}=await te();a.provinceList=t,(e=r.value)==null||e.enumMap.set("provinceId",a.provinceList)}catch(t){console.log(t)}}async function M(e){var t;try{const{data:l}=await ae(e);a.cityList=l,(t=r.value)==null||t.enumMap.set("cityId",a.cityList)}catch(l){console.log(l)}}async function P(e){var t;try{const{data:l}=await re(e);a.districtList=l,(t=r.value)==null||t.enumMap.set("districtId",a.districtList)}catch(l){console.log(l)}}async function B(e){var t;try{const{data:l}=await le(e);a.apartmentList=l,(t=r.value)==null||t.enumMap.set("apartmentId",a.apartmentList)}catch(l){console.log(l)}}function N(){var e;a.cityId="",a.cityList=[],(e=r.value)==null||e.enumMap.set("cityId",[]),r.value.searchParam.cityId=""}function g(){var e;a.districtId="",a.districtList=[],(e=r.value)==null||e.enumMap.set("districtId",[]),r.value.searchParam.districtId=""}function p(){var e;a.apartmentId="",a.apartmentList=[],(e=r.value)==null||e.enumMap.set("apartmentId",[]),r.value.searchParam.apartmentId=""}const S=async()=>{let e=r.value.searchParam.provinceId;e&&(N(),g(),p(),await M(e))},O=()=>{a.provinceId="",r.value.searchParam.provinceId="",N(),g(),p()},V=async()=>{let e=r.value.searchParam.cityId;e&&(g(),p(),await P(e))},H=()=>{console.log("清空城市"),a.cityId="",r.value.searchParam.cityId="",g(),p()},F=async()=>{let e=r.value.searchParam.districtId;e&&(p(),await B(e))},R=()=>{console.log("清空区域"),a.districtId="",r.value.searchParam.districtId="",p()},W=async()=>{console.log("公寓改变")},x=()=>{console.log("清空公寓"),a.apartmentId="",r.value.searchParam.apartmentId=""},$=e=>({list:e==null?void 0:e.records,total:e==null?void 0:e.total}),j=e=>{E.push({path:"/rentManagement/agreement/addOrEditAgreement",query:{id:e.id}})},G=()=>{E.push({path:"/rentManagement/agreement/addOrEditAgreement"})},U=async e=>{var t;await _(oe,e.id,`删除${e.name+e.apartmentInfo.name+e.roomInfo.roomNumber}房间`),(t=r.value)==null||t.getTableList()},q=async e=>{var t;await _(L,{id:e.id,status:i.CANCELLED},"取消租约"),(t=r.value)==null||t.getTableList()},K=async e=>{var t;await _(L,{id:e.id,status:i.SIGNED},"确认续约"),(t=r.value)==null||t.getTableList()},z=async e=>{var t;await _(L,{id:e.id,status:i.CONFIRMED},"确认退租"),(t=r.value)==null||t.getTableList()};return Y(()=>{A()}),(e,t)=>{const l=s("el-button"),I=s("el-card");return v(),h(I,null,{default:c(()=>[n(Z,{ref_key:"proTable",ref:r,dataCallback:$,columns:D,requestApi:C(se),initParam:T,stripe:!0},{tableHeader:c(()=>[n(l,{type:"primary",icon:"Plus",onClick:G},{default:c(()=>[m(" 新增租约 ")]),_:1})]),operation:c(o=>[n(l,{type:"success",icon:"Edit",onClick:u=>j(o.row)},{default:c(()=>[m(" 修改 ")]),_:2},1032,["onClick"]),n(l,{type:"danger",icon:"Delete",onClick:u=>U(o.row)},{default:c(()=>[m(" 删除 ")]),_:2},1032,["onClick"]),o.row.status===C(i).RENEW_TO_BE_CONFIRMED?(v(),h(l,{key:0,type:"warning",icon:"Warning",onClick:u=>K(o.row)},{default:c(()=>[m(" 确认续约 ")]),_:2},1032,["onClick"])):k("",!0),o.row.status===C(i).WAITING?(v(),h(l,{key:1,type:"warning",icon:"Warning",onClick:u=>q(o.row)},{default:c(()=>[m(" 取消租约 ")]),_:2},1032,["onClick"])):k("",!0),o.row.status===C(i).TO_BE_CONFIRMED?(v(),h(l,{key:2,type:"danger",icon:"Warning",onClick:u=>z(o.row)},{default:c(()=>[m(" 确认退租 ")]),_:2},1032,["onClick"])):k("",!0)]),_:1},8,["requestApi","initParam"])]),_:1})}}});export{ye as default};
