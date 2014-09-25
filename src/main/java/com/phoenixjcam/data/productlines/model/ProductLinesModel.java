package com.phoenixjcam.data.productlines.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "productlines", schema = "db_jv_crm")
public class ProductLinesModel
{
	@Id
	@Column(name = "productLine", nullable = false, length = 50)
	private String productLine;

	@Column(name = "textDescription", nullable = true, length = 4000)
	private String textDescription;

	@Lob
	@Column(name = "htmlDescription", nullable = true)
	private String htmlDescription;

	@Lob
	@Column(name = "image", nullable = true, length = 400000)
	private byte[] image;

	public String getProductLine()
	{
		return productLine;
	}

	public void setProductLine(String productLine)
	{
		this.productLine = productLine;
	}

	public String getTextDescription()
	{
		return textDescription;
	}

	public void setTextDescription(String textDescription)
	{
		this.textDescription = textDescription;
	}

	public String getHtmlDescription()
	{
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription)
	{
		this.htmlDescription = htmlDescription;
	}

	public byte[] getImage()
	{
		return image;
	}

	public void setImage(byte[] image)
	{
		this.image = image;
	}

}
