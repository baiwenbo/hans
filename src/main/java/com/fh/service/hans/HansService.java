package com.fh.service.hans;

import com.fh.dao.DaoSupport;
import com.fh.entity.Page;

import com.fh.entity.qizhe.Audit;
import com.fh.entity.qizhe.Images;
import com.fh.util.PageData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("hansService")
public class HansService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;


	/*
	* 查询地址
	*/
	public PageData saddress(PageData pd)throws Exception{
		return (PageData)dao.findForObject("HansAddressMapper.saddress", pd);
	}

	/*
	* 查询加油站全部名字
	*/
	public List<PageData> query(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("HansAddressMapper.query", pd);
	}

	/*
	* 新增
	*/
	public void save(PageData pd)throws Exception{
		dao.save("HansScpcMapper.insert", pd);
	}

	/*
	 * 新增
	 */
	public void saveImage(Images images)throws Exception{
		dao.save("HansScpcMapper.saveImage", images);
	}

	public List<PageData> getImageDeal(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("HansScpcMapper.getImageDeal", pd);
	}

	public void saveAudit2(PageData pd) throws  Exception{
		dao.save("HansScpcMapper.saveAudit2", pd);
	}

	public void updateAudit2(PageData pd) throws  Exception{
		dao.save("HansScpcMapper.updateAudit2", pd);
	}

	public void saveAudit(PageData pd) throws  Exception{
		dao.save("HansScpcMapper.saveAudit", pd);
	}

	public Audit getAuditById(String id) throws Exception {
		return (Audit) dao.findForObject("HansScpcMapper.getAuditById", id);
	}

	public void updateAppealReply(PageData pd) throws Exception {
		dao.findForObject("HansScpcMapper.updateAppealReply", pd);
	}

	public void updateLastReply(PageData pd) throws Exception {
		dao.findForObject("HansScpcMapper.updateLastReply", pd);
	}

	public long countAudit(PageData pd) throws Exception {
		return (long) dao.findForObject("HansScpcMapper.countAudit", pd);
	}

	public List<Audit> getAuditByscpcid(String scpcid) throws Exception {
		return (List<Audit>) dao.findForList("HansScpcMapper.getAuditByscpcid", scpcid);
	}

	/*
	* 删除
	*/
	public void delete(PageData pd)throws Exception{
		dao.delete("HansScpcMapper.delete", pd);
	}
	
	/*
	* 修改
	*/
	public void edit(PageData pd)throws Exception{
		dao.update("HansScpcMapper.update", pd);
	}

	
	/*
	*列表
	*/
	public List<PageData> listPdPageName(Page page)throws Exception{
		return (List<PageData>)dao.findForList("HansScpcMapper.namelistPage", page);
	}

	public List<PageData> monthList(Page page)throws Exception{
		return (List<PageData>)dao.findForList("HansScpcMapper.monthListPage", page);
	}

	public List<PageData> aduitScpc(Page page)throws Exception{
		return (List<PageData>)dao.findForList("HansScpcMapper.findAuditScpclistPage", page);
	}

	/*
	*油站列表
	*/
	public List<PageData> qname(Page page)throws Exception{
		return (List<PageData>)dao.findForList("HansScpcMapper.qnamePage", page);
	}
	/*
      *分公司列表
      */
	public List<PageData> qgongsi(Page page)throws Exception{
		return (List<PageData>)dao.findForList("HansScpcMapper.qgongsiPage", page);
	}


	/*
	*列表(全部)
	*/
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("AdIssueMapper.listAll", pd);
	}
	
	/*
	* 通过id获取数据
	*/
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("HansScpcMapper.findById", pd);
	}
	public PageData findByscpcId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("HansScpcMapper.findByscpcId", pd);
	}

	public PageData findAudit2(PageData pd)throws Exception{
		return (PageData)dao.findForObject("HansScpcMapper.findAudit2", pd);
	}
	/*
        * 通过qname获取数据
        */
	public PageData findByName(PageData pd)throws Exception{
		return (PageData)dao.findForObject("HansScpcMapper.findByName", pd);
	}

	/*
	* 批量删除
	*/
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("AdIssueMapper.deleteAll", ArrayDATA_IDS);
	}

	/*
        * 申诉开
        */
	public void shensukai(PageData pd)throws Exception{
		dao.delete("HansScpcMapper.updatekai", pd);
	}
	/*
        * 申诉关
        */
	public void shensuguan(PageData pd)throws Exception{
		dao.delete("HansScpcMapper.updateguan", pd);
	}

	public List<String> getMonthList() throws Exception {
		return (List<String>) dao.findForList("HansScpcMapper.getMonthList", null);
	}

		//导出excel
	public List<PageData> excelScpc(Page page)throws Exception{
		return (List<PageData>)dao.findForList("HansScpcMapper.findAllAuditScpclistPage", page);
	}



}

